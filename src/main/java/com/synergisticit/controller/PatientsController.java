package com.synergisticit.controller;

import com.synergisticit.domain.Patients;
import com.synergisticit.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://54.252.239.111:3000")
//@CrossOrigin(origins = "http://localhost:3000")
@RestController

@RequestMapping(value = "patients")
public class PatientsController {
    @Autowired
    PatientsService patientsService;

    @PutMapping("save")
    public ResponseEntity<Patients> savePatients(@RequestBody Patients Patients){

        Patients savedUser = patientsService.save(Patients);
        return new ResponseEntity<Patients>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("find")
    public ResponseEntity<?> findPatients(@RequestParam String userID){
        System.out.println("USERID FROM JAVA : "+ userID);
        if(userID != null){
            Patients foundUser = patientsService.findById(userID);
            if(foundUser != null){
                return new ResponseEntity<Patients>(foundUser, HttpStatus.FOUND);
            } else {
                //User savedUser = userService.save(user);
                return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);            }
        } else {
            return null;
        }
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Patients>> findAllPatients(){
        return new ResponseEntity<List<Patients>>(patientsService.findAll(), HttpStatus.FOUND);
    }

    @PostMapping("update")
    public ResponseEntity<Patients> updatePatients(@RequestBody Patients Patients){

        Patients Patients1 = patientsService.update(Patients);
        return new ResponseEntity<Patients>(Patients1, HttpStatus.OK);
    }
}
