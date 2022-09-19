package com.project.patient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class DoctorDto {
    private int doctorId;
    private String doctorName;
    private String doctorAge;
    private String doctorGender;
    private String specialist;
    private int totalPatient;


}
