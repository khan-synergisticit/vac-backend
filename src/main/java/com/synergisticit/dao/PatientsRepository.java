package com.synergisticit.dao;

import com.synergisticit.domain.Patients;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PatientsRepository extends MongoRepository<Patients, String>{
    Page<Patients> findAll(Pageable pageable);
}