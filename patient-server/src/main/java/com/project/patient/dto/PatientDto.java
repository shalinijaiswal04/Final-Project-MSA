package com.project.patient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PatientDto {
    private int patientId;
    private String patientName;
    private DoctorDto visitedDoctor;
    private String dateOfVisit;
    private String doctorPrescription;
    private int patientAge;

}
