package com.synergisticit.service;

import com.synergisticit.dao.PatientsRepository;
import com.synergisticit.domain.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientsServiceImpl implements PatientsService{
    @Autowired
    PatientsRepository patientsRepository;

    @Override
    public Patients save(Patients user) {
        return patientsRepository.save(user);
    }

    @Override
    public Patients findById(String userID) {
        Optional<Patients> userDetails = patientsRepository.findById(userID);
        return userDetails.orElse(null);
    }

    @Override
    public Page<Patients> findAll(Pageable pageable) {
        return (Page<Patients>) patientsRepository.findAll(pageable);
    }

    @Override
    public Boolean deleteByID(String userID) {
        patientsRepository.deleteById(userID);
        return true;
    }

    @Override
    public Patients update(Patients user) {
        return patientsRepository.save(user);
    }

    @Override
    public long count() {
        return patientsRepository.count();
    }
}
