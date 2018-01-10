package com.krchis.bootjsp.repository;

import com.krchis.bootjsp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    public User findByUsername(String username);
}
