package com.krchisjsp.krchisjsp.Service;

import com.krchisjsp.krchisjsp.domain.UserJpaTest;
import com.krchisjsp.krchisjsp.repository.UserJpaTestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserJpaTestServiceImpl implements UserJpaTestService {

    @Autowired
    private UserJpaTestRepository userJpaTestRepository;

    @Override
    public UserJpaTest getUserByUsername(String username) {
        return userJpaTestRepository.findOne(username);
    }
}
