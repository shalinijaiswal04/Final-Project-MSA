package com.project.patient;

import com.project.patient.data.PatientData;
import com.project.patient.dto.PatientDto;
import com.project.patient.service.PatientService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class HospitalServerApplicationTests {

	@MockBean
	PatientService patientService;

	@Test
	void getAllPatientTest(){
		Mockito.when(patientService.getAllPatient()).thenReturn(
				Stream.of(PatientDto.builder().patientId(1).patientName("patient1").patientAge(24).build(),
						PatientDto.builder().patientId(2).patientName("patient2").patientAge(25).build()
				).collect(Collectors.toList()));

		Assertions.assertEquals(2, patientService.getAllPatient().size());
	}

	@Test
	void getPatientByIdTest(){
		PatientDto expectedPatient = PatientDto.builder().patientId(1).patientName("patient1").patientAge(22).build();
		Mockito.when(patientService.getById(1)).thenReturn(PatientDto.builder().patientId(1).patientName("patient1").patientAge(22).build());

		Assertions.assertEquals(patientService.getById(1), expectedPatient);
	}

	@Test
	void createPatientTest(){
		PatientData patientData = PatientData.builder().patientName("patient1").patientAge(22).build();
		PatientDto expectedPatient = PatientDto.builder().patientName("patient1").patientAge(22).build();
		Mockito.when(patientService.create(patientData)).thenReturn(PatientDto.builder().patientName("patient1").patientAge(22).build());
		Assertions.assertEquals(patientService.create(patientData), expectedPatient);
	}

}
