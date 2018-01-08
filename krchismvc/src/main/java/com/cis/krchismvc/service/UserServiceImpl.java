package com.cis.krchismvc.service;

import com.cis.krchismvc.repository.KrUser;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private SqlSession sqlSession;
    //private UserRepository userRepository;

    @Override
    public void creatuser(KrUser krUser) throws DataAccessException {
        try {
            //userRepository.createuser(krUser);
            sqlSession.insert("com.cis.krchismvc.repository.UserRepository.createuser", krUser);
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public List<KrUser> userList() throws DataAccessException {
        List<KrUser> userList = null;

        try {
            //userList = userRepository.userList();
            userList = sqlSession.selectList("com.cis.krchismvc.repository.UserRepository.userList");

        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }
        return userList;
    }

    @Override
    public KrUser getUserinfo(String userId) throws DataAccessException {

        KrUser kruser = null;

        try {
            //kruser = userRepository.getUserinfo(userId);
            kruser = sqlSession.selectOne("com.cis.krchismvc.repository.UserRepository.getUserinfo", userId);
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }
        return kruser;
    }

    @Override
    public void updateUser(Map<String, Object> paraMap) throws DataAccessException {
        try {
            //kruser = userRepository.getUserinfo(userId);
             sqlSession.update("com.cis.krchismvc.repository.UserRepository.updateUser", paraMap);
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public KrUser getUserinfobyId(long id) throws DataAccessException {
        KrUser kruser = null;

        try {
            //kruser = userRepository.getUserinfo(userId);
            kruser = sqlSession.selectOne("com.cis.krchismvc.repository.UserRepository.getUserinfobyId", id);
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }
        return kruser;
    }
}
