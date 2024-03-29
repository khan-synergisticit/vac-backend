package com.synergisticit.controller;

import com.synergisticit.domain.Patients;
import com.synergisticit.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
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
    public ResponseEntity<HashMap<String, Object>> findAllPatients(@RequestParam int pageNo, @RequestParam int pageSize){

        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Patients> pagedPatients = patientsService.findAll(pageable);
        List<Patients> patients = pagedPatients.getContent();
        HashMap<String, Object> hmap = new HashMap<String, Object>();
        hmap.put("count", patientsService.count());
        hmap.put("patients", patients);

        return new ResponseEntity<HashMap<String, Object>>(hmap, HttpStatus.FOUND);
    }

    @GetMapping("count")
    public ResponseEntity<Long> getCount(){
        return new ResponseEntity<Long>(patientsService.count(), HttpStatus.OK);
    }
    @PostMapping("update")
    public ResponseEntity<Patients> updatePatients(@RequestBody Patients Patients){

        Patients Patients1 = patientsService.update(Patients);
        return new ResponseEntity<Patients>(Patients1, HttpStatus.OK);
    }
}
