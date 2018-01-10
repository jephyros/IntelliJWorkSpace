package com.krchis.bootjsp.domain;



import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="kr_user")
public class User {
    @Id
    @GeneratedValue
    private Long usernum;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String password;
    private String name;
    private String nickname;
    private String email;
    @Column(nullable = false)
    private Boolean enabled;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    ////필드끝




    @Override
    public String toString() {
        return "User{" +
                "id=" + usernum +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", role=" + role +
                '}';
    }

    public Long getId() {
        return usernum;
    }

    public void setId(Long usernum) {
        this.usernum = usernum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private String getDateFormat(LocalDateTime dateTime,String format) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DateTimeFormatter.ofPattern(format));
    }
}
