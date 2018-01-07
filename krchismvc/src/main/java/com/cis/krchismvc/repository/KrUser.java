package com.cis.krchismvc.repository;

public class KrUser {
    private Long id;
    private String userID;
    private String name;
    private String password;
    private String email;
    private String createDate;
    private String modifyid;
    private String modifyDate;

    @Override
    public String toString() {
        return "KrUser{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
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
