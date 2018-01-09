package com.krchisjsp.krchisjsp.Service;

import com.krchisjsp.krchisjsp.domain.User;
import com.krchisjsp.krchisjsp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUserByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}
