package com.cis.krchismvc.repository;



import java.util.List;
import java.util.Map;


public interface UserRepository {
    public void createuser(KrUser krUser);
    public List<KrUser> userList();
    public KrUser getUserinfo(String userId);
    public void updateUser(Map<String,Object> paraMap);
    public KrUser getUserinfobyId(long id);
}
