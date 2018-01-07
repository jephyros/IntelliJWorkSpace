package com.cis.krchismvc.repository;

import org.springframework.stereotype.Repository;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Repository("userRepositoryImpl")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SqlSession sqlSession;


    @Override
    public void createuser(KrUser krUser) {
        sqlSession.insert("com.cis.krchismvc.repository.UserRepository.createuser",krUser);


    }

    @Override
    public List<KrUser> userList() {
        List<KrUser> userList =sqlSession.selectList("com.cis.krchismvc.repository.UserRepository.userList");
        return userList;
    }

    @Override
    public KrUser getUserinfo(String userId) {
        return sqlSession.selectOne("com.cis.krchismvc.repository.UserRepository.getUserinfo",userId);


    }
}
