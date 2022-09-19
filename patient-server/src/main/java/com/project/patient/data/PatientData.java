package com.project.patient.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PatientData {
    private String patientName;
    private int visitedDoctor;
    private String dateOfVisit;
    private String doctorPrescription;
    private int patientAge;

}
