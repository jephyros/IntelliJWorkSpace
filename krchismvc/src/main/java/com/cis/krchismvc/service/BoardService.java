package com.cis.krchismvc.service;

import com.cis.krchismvc.repository.Krboard;
import com.cis.krchismvc.repository.Krboard_index;

import java.util.List;

public interface BoardService {
    public List<Krboard_index> boardlist();
}
