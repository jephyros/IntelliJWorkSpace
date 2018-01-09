package com.krchisjsp.krchisjsp.repository;

import com.krchisjsp.krchisjsp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    public User findByUsername(String username);
}
