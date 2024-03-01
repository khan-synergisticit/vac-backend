package com.synergisticit.controller;


import com.synergisticit.domain.User;

import com.synergisticit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:27016")
@RestController
@RequestMapping("users")

public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("saveUser")
    public ResponseEntity<User> savesUser(@RequestBody User user){

        User savedUser = userService.save(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    @PostMapping("finduser")
    public  ResponseEntity<?> findUser(@RequestBody User user){

        if(user.getUserID() != null){

            User foundUser = userService.findById(user.getUserID());
            if(foundUser != null){

                return new ResponseEntity<User>(foundUser, HttpStatus.FOUND);
            } else {
                //User savedUser = userService.save(user);

                return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
            }
        } else {
            return null;
        }
    }
    @GetMapping("findAll")
    public  ResponseEntity<List<User>> findAllUsers(){

        return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.FOUND);
    }
}
