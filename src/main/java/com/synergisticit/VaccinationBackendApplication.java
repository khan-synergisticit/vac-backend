package com.synergisticit;

import com.synergisticit.dao.PatientsRepository;
import com.synergisticit.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;



@SpringBootApplication


public class VaccinationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationBackendApplication.class, args);
	}

}
