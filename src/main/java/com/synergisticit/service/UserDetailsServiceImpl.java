package com.synergisticit.service;

import com.synergisticit.dao.UserDetailsRepository;
import com.synergisticit.domain.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserDetailsRepository userDetailsRepository;
    @Override
    public UserDetails save(UserDetails user) {
        return userDetailsRepository.save(user);
    }

    @Override
    public UserDetails findById(String userID) {
        Optional<UserDetails> userDetails = userDetailsRepository.findById(userID);
        return userDetails.orElse(null);
    }

    @Override
    public List<UserDetails> findAll() {
        return (List<UserDetails>) userDetailsRepository.findAll();
    }

    @Override
    public Boolean deleteByID(String userID) {
        userDetailsRepository.deleteById(userID);
        return true;
    }

    @Override
    public UserDetails update(UserDetails user) {

        return userDetailsRepository.save(user);
    }
}
