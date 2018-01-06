package com.cis.krchismvc.chkdb;

import org.springframework.dao.DataAccessException;

import java.util.List;

public interface UsertestService {
    public List<Usertest> userList() throws DataAccessException;
}
