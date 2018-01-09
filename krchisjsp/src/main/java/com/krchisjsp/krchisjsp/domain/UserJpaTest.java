package com.krchisjsp.krchisjsp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserJpaTest {
    @Id
    private String username;

    @Column(nullable = false)
    private String password;

    private String remark;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
