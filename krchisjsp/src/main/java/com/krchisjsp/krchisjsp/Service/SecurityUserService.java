package com.krchisjsp.krchisjsp.Service;

import com.krchisjsp.krchisjsp.domain.SecurityUser;
import com.krchisjsp.krchisjsp.domain.User;
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
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUserName(username);
        return new SecurityUser(user);

    }
}
