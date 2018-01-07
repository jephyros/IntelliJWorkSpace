package com.cis.krchismvc.chkdb;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UsertestDaoImple")
public class UsertestDaoImple implements UsertestDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Usertest> userList() {



        List <Usertest> userList =null;
        userList = sqlSession.selectList("com.cis.krchismvc.chkdb.selectCmtuser");

        return userList;


    }
}
