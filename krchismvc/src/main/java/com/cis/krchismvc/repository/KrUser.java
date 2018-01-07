package com.cis.krchismvc.repository;

public class KrUser {
    private Long id;
    private String userId;
    private String name;
    private String password;
    private String email;
    private String createDate;
    private String modifyid;
    private String modifyDate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(String userId) { this.userId = userId; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setModifyid(String modifyid) {
        this.modifyid = modifyid;
    }

    @Override
    public String toString() {
        return "KrUser{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createDate='" + createDate + '\'' +
                ", modifyid='" + modifyid + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }


    //select id,userId,name,password,email,createDate,modifyid,modifyDate from Kruser;

}
