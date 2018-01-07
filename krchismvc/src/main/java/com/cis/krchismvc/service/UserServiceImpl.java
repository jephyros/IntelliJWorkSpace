package com.cis.krchismvc.service;

import com.cis.krchismvc.repository.KrUser;
import com.cis.krchismvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void creatuser(KrUser krUser) throws DataAccessException {
        try{
            userRepository.createuser(krUser);
        }catch (DataAccessException e){
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public List<KrUser> userList() throws DataAccessException {
        List<KrUser> userList = null;

        try{
            userList = userRepository.userList();
        }catch(DataAccessException e){
            e.printStackTrace();
            throw e;
        }
        return userList;
    }
}
