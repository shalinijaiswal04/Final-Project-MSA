package com.project.doctor.service;

import com.project.doctor.dao.DoctorDao;
import com.project.doctor.data.DoctorData;
import com.project.doctor.dto.DoctorDto;
import com.project.doctor.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoctorImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;
    @Override
    public DoctorDto create(DoctorData doctorData) {
        Doctor doctor = doctorDao.save(mapToModel(doctorData));
        return mapToDto(doctor);
    }

    @Override
    public DoctorDto getById(int id) {
        Optional<Doctor> doctor = doctorDao.findById(id);
        return doctor.map(this:: mapToDto).orElse(null);
    }

    @Override
    public List<DoctorDto> getAllDoctor() {
        List<Doctor> doctor = doctorDao.findAll();
        return doctor.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public void updatePatientAttend(int id) {
        Optional<Doctor> doctor = doctorDao.findById(id);
        if (doctor.isPresent()){
            doctor.get().setTotalPatient(doctor.get().getTotalPatient()+1);
            doctorDao.save(doctor.get());
        }

    }

    private Doctor mapToModel(DoctorData doctorData) {
        return Doctor.builder()
                .doctorName(doctorData.getDoctorName())
                .doctorAge(doctorData.getDoctorAge())
                .doctorGender(doctorData.getDoctorGender())
                .specialist(doctorData.getSpecialist())
                .totalPatient(0)
                .build();
    }


    private DoctorDto mapToDto(Doctor doctor) {
        return DoctorDto.builder()
                .doctorId(doctor.getDoctorId())
                .doctorName(doctor.getDoctorName())
                .doctorAge(doctor.getDoctorAge())
                .doctorGender(doctor.getDoctorGender())
                .specialist(doctor.getSpecialist())
                .totalPatient(doctor.getTotalPatient())
                .build();
    }
}
