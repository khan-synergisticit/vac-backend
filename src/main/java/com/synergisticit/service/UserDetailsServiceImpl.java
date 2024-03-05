package com.synergisticit.service;

import com.synergisticit.dao.UserDetailsRepository;
import com.synergisticit.domain.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserDetailsRepository userDetailsRepository;
    @Override
    public UserDetails save(UserDetails user) {
        return null;
    }

    @Override
    public UserDetails findById(String userID) {
        return null;
    }

    @Override
    public List<UserDetails> findAll() {
        return null;
    }

    @Override
    public Boolean deleteByID(String userID) {
        return null;
    }
}
