package com.project.patient.service;


import com.project.patient.dao.PatientDao;
import com.project.patient.data.PatientData;

import com.project.patient.dto.DoctorDto;
import com.project.patient.dto.PatientDto;
import com.project.patient.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PatientImpl implements PatientService {
    @Autowired
    private PatientDao patientDao;


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public PatientDto create(PatientData patientData) {
        Patient patient = patientDao.save(mapToModel(patientData));
        updatePatientAttended(patient.getVisitedDoctor());
        return mapToDto(patient);
    }

    private void updatePatientAttended(int id) {
        restTemplate.getForObject("http://localhost:9091/doctors/updatePatientAttend/"+id,Void.class);
    }

    @Override
    public PatientDto getById(int id) {
        Optional<Patient> patient = patientDao.findById(id);
        return patient.map(this::mapToDto).orElse(null);
    }

    @Override
    public List<PatientDto> getAllPatient() {
        List<Patient> patients = patientDao.findAll();
        return patients.stream().map(this::mapToDto).collect(Collectors.toList());

    }


    private Patient mapToModel(PatientData patientData) {
        return Patient.builder()
                .patientName(patientData.getPatientName())
                .patientAge(patientData.getPatientAge())
                .dateOfVisit(patientData.getDateOfVisit())
                .visitedDoctor(patientData.getVisitedDoctor())
                .doctorPrescription(patientData.getDoctorPrescription())
                .build();
    }


    private PatientDto mapToDto(Patient patient) {
        return PatientDto.builder()
                .patientId(patient.getPatientId())
                .patientName(patient.getPatientName())
                .patientAge(patient.getPatientAge())
                .dateOfVisit(patient.getDateOfVisit())
                .doctorPrescription(patient.getDoctorPrescription())
                .visitedDoctor(getDoctor(patient.getVisitedDoctor()))
                .build();
    }
    private DoctorDto getDoctor(int id){
        return restTemplate.getForObject("http://localhost:9091/doctors/id/"+id,DoctorDto.class);
    }

}
