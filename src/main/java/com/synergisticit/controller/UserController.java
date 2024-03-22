package com.synergisticit.controller;

import com.synergisticit.domain.User;

import com.synergisticit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


//@CrossOrigin(origins = "http://54.252.239.111:27016")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "users")

public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("save")
    public ResponseEntity<User> savesUser(@RequestBody User user){

        User savedUser = userService.save(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping ("find")
    public  ResponseEntity<?> findUser(@RequestBody User user){
        if(user.getUserID() != null){
            User foundUser = userService.findById(user.getUserID());
            if(foundUser != null){
                return new ResponseEntity<User>(foundUser, HttpStatus.FOUND);
            } else {
                //User savedUser = userService.save(user);
                return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);            }
        } else {
            return null;
        }
    }
    @GetMapping("findAll")
    public  ResponseEntity<List<User>> findAllUsers(){
        return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.FOUND);
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> deleteUser(@RequestBody String userID){
        Boolean deleted = userService.deleteByID(userID);
        if(deleted){
            return new ResponseEntity<String>("User deleted.", HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("User deleted error.", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> updateUser(@RequestBody User user){
       User updatedUser = userService.update(user);
       return  new ResponseEntity<User>(updatedUser, HttpStatus.OK);
    }
}
