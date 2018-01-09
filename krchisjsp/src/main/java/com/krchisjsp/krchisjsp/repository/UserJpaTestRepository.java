package com.krchisjsp.krchisjsp.repository;

import com.krchisjsp.krchisjsp.domain.UserJpaTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaTestRepository extends JpaRepository<UserJpaTest,String > {
    //public UserJpaTest findbyUsername(String username);
}
