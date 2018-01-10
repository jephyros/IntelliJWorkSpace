package com.krchis.bootjsp.domain;

import org.springframework.security.core.authority.AuthorityUtils;

public class SecurityUser extends org.springframework.security.core.userdetails.User {
    private static final long serialVersionUID = 7369103590269799780L;
    private User user;
    private String rname;


    public SecurityUser(User user) {
        super(user.getUserId(),user.getPassword(),
                AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
        this.rname = user.getName();

    }

    public User getUser() {
        return user;
    }
    public Role getRole(){
        return user.getRole();
    }
}
