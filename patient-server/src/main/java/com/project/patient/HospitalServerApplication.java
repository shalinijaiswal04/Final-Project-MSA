package com.project.patient;

import com.project.doctor.dao.DoctorDao;
import com.project.doctor.service.DoctorImpl;
import com.project.doctor.service.DoctorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HospitalServerApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}



	public static void main(String[] args) {
		SpringApplication.run(HospitalServerApplication.class, args);
	}

}
