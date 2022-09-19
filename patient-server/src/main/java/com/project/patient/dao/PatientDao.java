package com.project.patient.dao;
import com.project.patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient,Integer> {
}
