package com.krchis.bootjsp.service;

import com.krchis.bootjsp.domain.User;
import com.krchis.bootjsp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUserByUserId(String userId)
    {
        return userRepository.findByUserId(userId);
    }
}
