package com.krchis.bootjsp.repository;

import com.krchis.bootjsp.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {

}
