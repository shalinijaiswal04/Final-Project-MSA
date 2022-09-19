package com.project.doctor.service;

import com.project.doctor.data.DoctorData;
import com.project.doctor.dto.DoctorDto;
import com.project.doctor.model.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DoctorService  {


    DoctorDto create(DoctorData doctorData);

    DoctorDto getById(int id);

    List<DoctorDto> getAllDoctor();
    void updatePatientAttend(int id);
}
