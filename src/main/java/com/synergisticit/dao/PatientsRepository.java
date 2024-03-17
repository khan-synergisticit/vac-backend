package com.synergisticit.dao;

import com.synergisticit.domain.Patients;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface PatientsRepository extends CrudRepository<Patients, String> {
}

//public interface PatientsRepository extends MongoRepository<Patients, String>{}