package com.project.doctor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doctorId;
    private String doctorName;
    private String doctorAge;
    private String doctorGender;
    private String specialist;
    private int totalPatient;

    public Doctor(String doctorName, String doctorAge, String doctorGender, String specialist) {
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorGender = doctorGender;
        this.specialist = specialist;
    }
}
