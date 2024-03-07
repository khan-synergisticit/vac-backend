package com.synergisticit.controller;

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
    public ResponseEntity<UserDetails> saves(@RequestBody UserDetails userDetails){
        UserDetails savedUser = userDetailsService.save(userDetails);
        return new ResponseEntity<UserDetails>(savedUser, HttpStatus.CREATED);
    }

    @PostMapping("find")
    public ResponseEntity<?> finds(@RequestBody UserDetails userDetails){
        if(userDetails.getUserID() != null){
            UserDetails foundUser = userDetailsService.findById(userDetails.getUserID());
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
    public ResponseEntity<List<UserDetails>> findAlls(){
        return new ResponseEntity<List<UserDetails>>(userDetailsService.findAll(), HttpStatus.FOUND);
    }

    @PutMapping("update")
    public ResponseEntity<UserDetails> updates(@RequestBody UserDetails userDetails){
        UserDetails userDetails1 = userDetailsService.update(userDetails);
        return new ResponseEntity<UserDetails>(userDetails1, HttpStatus.OK);
    }
}
