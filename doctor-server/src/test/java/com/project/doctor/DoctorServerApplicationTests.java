package com.project.doctor;

import com.project.doctor.data.DoctorData;
import com.project.doctor.dto.DoctorDto;
import com.project.doctor.service.DoctorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class DoctorServerApplicationTests {

	@MockBean
	DoctorService doctorService;

	@Test
	void getAllDoctorTest(){
		Mockito.when(doctorService.getAllDoctor()).thenReturn(
				Stream.of(DoctorDto.builder().doctorId(1).doctorName("Doc1").specialist("spec1").build(),
						DoctorDto.builder().doctorId(2).doctorName("Doc2").specialist("spec2").build()
				).collect(Collectors.toList()));

		Assertions.assertEquals(2, doctorService.getAllDoctor().size());
	}
	@Test
	void getDoctorByIdTest(){
		DoctorDto expectedDoctor = DoctorDto.builder().doctorId(1).doctorName("Doc1").specialist("spec1").build();
		Mockito.when(doctorService.getById(1)).thenReturn(DoctorDto.builder().doctorId(1).doctorName("Doc1").specialist("spec1").build());

		Assertions.assertEquals(doctorService.getById(1), expectedDoctor);
	}
	@Test
	void createDoctorTest(){
		DoctorData doctor = DoctorData.builder().doctorName("Doc1").specialist("spec1").build();
		DoctorDto expectedDoctor = DoctorDto.builder().doctorName("Doc1").specialist("spec1").build();
		Mockito.when(doctorService.create(doctor)).thenReturn(DoctorDto.builder().doctorName("Doc1").specialist("spec1").build());
		Assertions.assertEquals(doctorService.create(doctor), expectedDoctor);
	}


}
