package com.krchis.bootjsp;

import com.krchis.bootjsp.domain.Role;
import com.krchis.bootjsp.domain.User;
import com.krchis.bootjsp.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BootjspApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootjspApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;
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



        };
    }
}
