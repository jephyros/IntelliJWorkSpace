package com.cis.krchismvc.service;

import com.cis.krchismvc.repository.Krboard;
import com.cis.krchismvc.repository.Krboard_index;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardServiceImpl")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Krboard_index> boardlist() {
        List<Krboard_index> boardList = null;

        try {
            //userList = userRepository.userList();
            boardList = sqlSession.selectList("com.cis.krchismvc.repository.BoardRepository.boardlist");

        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        }
        return boardList;
    }
}
