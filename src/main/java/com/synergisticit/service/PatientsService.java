package com.synergisticit.service;

import com.synergisticit.domain.Patients;

import java.util.List;

public interface PatientsService {

    Patients save(Patients user);
    Patients findById(String userID);
    List<Patients> findAll();
    Boolean deleteByID(String userID);
    Patients update(Patients user);
}
