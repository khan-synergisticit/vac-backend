package com.synergisticit.service;

import com.synergisticit.domain.User;

import java.util.List;

public interface UserService {

    User save(User user);
    User findById(String userID);
    List<User> findAll();
    Boolean deleteByID(String userID);
    User update(User user);
    Boolean exists(String userID);

}