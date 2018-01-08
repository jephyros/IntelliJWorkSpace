package com.cis.krchismvc.service;


import com.cis.krchismvc.repository.KrUser;
import org.springframework.dao.DataAccessException;



import java.util.List;
import java.util.Map;


public interface UserService {
    public void creatuser(KrUser krUser) throws DataAccessException;
    public List<KrUser> userList() throws DataAccessException;
    public KrUser getUserinfo(String userId) throws DataAccessException;
    public void updateUser(Map<String,Object> paraMap) throws DataAccessException;
    public KrUser getUserinfobyId(long id) throws DataAccessException;


}
