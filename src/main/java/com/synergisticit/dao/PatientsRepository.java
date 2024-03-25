package com.synergisticit.dao;

import com.synergisticit.domain.Patients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends MongoRepository<Patients, String>{}