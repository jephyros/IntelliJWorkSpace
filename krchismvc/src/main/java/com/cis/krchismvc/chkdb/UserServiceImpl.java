package com.cis.krchismvc.chkdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UsertestService {


    @Autowired
    private UsertestDao usertestDao;

    @Override
    public List<Usertest> userList() throws DataAccessException {
        List<Usertest>  UserList = null;
        try {
            UserList =  usertestDao.userList();
        }catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }
        return UserList;

    }
}
