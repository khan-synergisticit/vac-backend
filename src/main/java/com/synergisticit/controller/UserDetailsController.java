package com.synergisticit.controller;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.synergisticit.domain.User;
import com.synergisticit.domain.UserDetails;
import com.synergisticit.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://54.252.239.111:27016")
//@CrossOrigin(origins = "http://localhost:27016")
@RestController

@RequestMapping(value = "userDetails")
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping("save")
    public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails){

        UserDetails savedUser = userDetailsService.save(userDetails);
        return new ResponseEntity<UserDetails>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("find")
    public ResponseEntity<?> findUserDetails(@RequestParam String userID){

        if(userID != null){
            UserDetails foundUser = userDetailsService.findById(userID);
            if(foundUser != null){
                return new ResponseEntity<UserDetails>(foundUser, HttpStatus.FOUND);
            } else {
                //User savedUser = userService.save(user);
                return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);            }
        } else {
            return null;
        }
    }

    @GetMapping("findAll")
    public ResponseEntity<List<UserDetails>> findAllUserDetails(){
        return new ResponseEntity<List<UserDetails>>(userDetailsService.findAll(), HttpStatus.FOUND);
    }

    @PutMapping("update")
    public ResponseEntity<UserDetails> updateUserDetails(@RequestBody UserDetails userDetails){

        UserDetails userDetails1 = userDetailsService.update(userDetails);
        System.out.println("Update " + userDetails1);
        return new ResponseEntity<UserDetails>(userDetails1, HttpStatus.OK);
    }
}
