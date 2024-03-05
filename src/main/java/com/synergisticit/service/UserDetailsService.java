package com.synergisticit.service;

import com.synergisticit.domain.UserDetails;

import java.util.List;

public interface UserDetailsService {
    UserDetails save(UserDetails user);
    UserDetails findById(String userID);
    List<UserDetails> findAll();
    Boolean deleteByID(String userID);
}
