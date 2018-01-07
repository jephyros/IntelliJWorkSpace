package com.cis.krchismvc.service;


import com.cis.krchismvc.repository.KrUser;
import org.springframework.dao.DataAccessException;

public interface UserService {
    public void creatuser(KrUser krUser) throws DataAccessException;

}
