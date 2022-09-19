package com.project.doctor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DoctorDto {
    private int doctorId;
    private String doctorName;
    private String doctorAge;
    private String doctorGender;
    private String specialist;
    private int totalPatient;



}
