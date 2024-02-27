package com.synergisticit.service;

import com.synergisticit.domain.User;

import java.util.List;

public interface UserService {

    User save(User user);
    User findById(String userID);
    List<User> findAll();
    Boolean deleteByID(Long userID);

    Boolean deleteByID(String userID);
}