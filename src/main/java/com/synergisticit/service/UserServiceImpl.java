package com.synergisticit.service;

import com.synergisticit.dao.UserRepository;
import com.synergisticit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(String userID) {
        Optional<User> optionalUser = userRepository.findById(userID);
        return optionalUser.orElse(null);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }


    @Override
    public Boolean deleteByID(String userID) {
        userRepository.deleteById(userID);
        return true;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
