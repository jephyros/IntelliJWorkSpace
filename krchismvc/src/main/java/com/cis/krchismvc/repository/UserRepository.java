package com.cis.krchismvc.repository;

import java.util.List;

public interface UserRepository {
    public void createuser(KrUser krUser);
    public List<KrUser> userList();
    public KrUser getUserinfo(String userId);
}
