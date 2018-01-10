package com.krchis.bootjsp.service;


import com.krchis.bootjsp.domain.User;

public interface UserService {
    public User getUserByUserId(String userId);
}
