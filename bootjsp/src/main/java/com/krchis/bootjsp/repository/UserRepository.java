package com.krchis.bootjsp.repository;

import com.krchis.bootjsp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUserId(String userId);
}
