package com.synergisticit.controller;


import com.synergisticit.domain.User;

import com.synergisticit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("saveUser")
    public ResponseEntity<?> savesUser(@RequestParam String userID, @RequestParam String userName,
                                       @RequestParam String password, @RequestParam String email){


        User user = new User(userID, userName, password, email);
        userService.save(user);
        return new ResponseEntity<>(user.toString(), HttpStatus.CREATED);
    }

    @RequestMapping("findAll")
    public  ResponseEntity<List<User>> findAllUsers(){

        return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.FOUND);
    }
}
