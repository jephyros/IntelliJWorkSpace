package com.krchisjsp.krchisjsp.Service;

import com.krchisjsp.krchisjsp.domain.UserJpaTest;
import org.springframework.stereotype.Service;

@Service
public interface UserJpaTestService {
    public UserJpaTest getUserByUsername(String username);
}
