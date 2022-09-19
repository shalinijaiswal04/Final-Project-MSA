package com.project.doctor.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DoctorData {

    private String doctorName;
    private String doctorAge;
    private String doctorGender;
    private String specialist;


}
