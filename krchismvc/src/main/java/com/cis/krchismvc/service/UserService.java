package com.cis.krchismvc.service;


import com.cis.krchismvc.repository.KrUser;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface UserService {
    public void creatuser(KrUser krUser) throws DataAccessException;
    public List<KrUser> userList() throws DataAccessException;

}
