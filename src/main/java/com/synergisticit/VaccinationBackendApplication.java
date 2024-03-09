package com.synergisticit;


import com.synergisticit.dao.UserDetailsRepository;
import com.synergisticit.dao.UserRepository;
import com.synergisticit.service.UserService;
import com.synergisticit.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {
		UserRepository.class, UserDetailsRepository.class
})
public class VaccinationBackendApplication  {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationBackendApplication.class, args);
	}

}

//public class VaccinationBackendApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(VaccinationBackendApplication.class, args);
//	}
//
//}
