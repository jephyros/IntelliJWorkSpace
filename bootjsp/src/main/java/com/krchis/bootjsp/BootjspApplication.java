package com.krchis.bootjsp;

import com.krchis.bootjsp.domain.Board;
import com.krchis.bootjsp.domain.Role;
import com.krchis.bootjsp.domain.User;
import com.krchis.bootjsp.repository.BoardRepository;
import com.krchis.bootjsp.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@EnableJpaAuditing
@SpringBootApplication
public class BootjspApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootjspApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoardRepository boardRepository;

    private LocalDateTime now = LocalDateTime.now();

    @Bean
    InitializingBean insertTestUser(){
        return() ->{
            User ssuer = new User();
            ssuer.setUserId("lss");
            ssuer.setPassword("1111");
            ssuer.setName(("이순신"));
            ssuer.setNickname("장군");
            ssuer.setEmail("lss@naver.com");
            ssuer.setEnabled(true);
            ssuer.setRole(Role.ROLE_USER);
            userRepository.save(ssuer);

            User s1 = new User();
            s1.setUserId("admin");
            s1.setPassword("1111");
            s1.setName(("홍길동"));
            s1.setNickname("관리자");
            s1.setEmail("hgd@naver.com");
            s1.setEnabled(true);
            s1.setRole(Role.ROLE_ADMIN);
            userRepository.save(s1);

            Board b1 = new Board();
            b1.setTitle("트럼프 남북회담성사 내탓이다.");
            b1.setContent("글입니다.");
            b1.setAnswercnt(0);
            b1.setCreateDate(now);
            b1.setCreateUsernum(1L);
            boardRepository.save(b1);

            Board b2 = new Board();
            b2.setTitle("남북정상회담 개최!!..");
            b2.setContent("글입니다.");
            b2.setAnswercnt(0);
            b2.setCreateDate(now);
            b2.setCreateUsernum(1L);
            boardRepository.save(b2);


        };
    }
}
