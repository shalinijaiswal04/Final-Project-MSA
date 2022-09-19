package com.project.patient.service;

import com.project.patient.data.PatientData;
import com.project.patient.dto.PatientDto;

import java.util.List;

public interface PatientService {


    PatientDto create( PatientData patientData);

    PatientDto getById(int id);


    List<PatientDto> getAllPatient();
}
