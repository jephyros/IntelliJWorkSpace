package com.krchis.bootjsp.service;

import com.krchis.bootjsp.domain.SecurityUser;
import com.krchis.bootjsp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserService implements UserDetailsService {


    private final UserService userService;

    @Autowired
    public SecurityUserService(UserService userService){
        this.userService=userService;
    }


    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userService.getUserByUserId(userId);
        return new SecurityUser(user);

    }
}
