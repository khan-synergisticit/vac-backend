package com.synergisticit.service;

import com.synergisticit.domain.Patients;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PatientsService {

    Patients save(Patients user);
    Patients findById(String userID);
    Page<Patients> findAll(Pageable pageable);
    Boolean deleteByID(String userID);
    Patients update(Patients user);
}
