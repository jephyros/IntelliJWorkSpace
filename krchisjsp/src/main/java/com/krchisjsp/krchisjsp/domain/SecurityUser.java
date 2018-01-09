package com.krchisjsp.krchisjsp.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Collection;

public class SecurityUser extends org.springframework.security.core.userdetails.User {
    private static final long serialVersionUID = 7369103590269799780L;
    private User user;

    public SecurityUser(User user) {
        super(user.getUsername(),user.getPassword(),
                AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    public Role getRole(){
        return user.getRole();
    }
}
