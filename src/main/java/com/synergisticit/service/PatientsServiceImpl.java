package com.synergisticit.service;

import com.synergisticit.dao.PatientsRepository;
import com.synergisticit.domain.Patients;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Patients> findAll() {
        return (List<Patients>) patientsRepository.findAll();
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
}
