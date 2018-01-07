package com.cis.krchismvc.repository;

import org.springframework.stereotype.Repository;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

@Repository("userRepositoryImpl")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SqlSession sqlSession;


    @Override
    public void createuser(KrUser krUser) {
        sqlSession.insert("com.cis.krchismvc.repository.UserRepository.createuser",krUser);


    }
}
