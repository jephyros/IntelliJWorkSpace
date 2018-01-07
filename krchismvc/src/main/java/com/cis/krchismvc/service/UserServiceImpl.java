package com.cis.krchismvc.service;

import com.cis.krchismvc.repository.KrUser;
import com.cis.krchismvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userDao;

    @Override
    public void creatuser(KrUser krUser) throws DataAccessException {
        try{
            userDao.createuser(krUser);
        }catch (DataAccessException e){
            e.printStackTrace();
            throw e;
        }

    }
}
