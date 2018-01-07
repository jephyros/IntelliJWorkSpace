package com.cis.krchismvc.controller;

import com.cis.krchismvc.repository.KrUser;
import com.cis.krchismvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    //회원가입폼
    @GetMapping("/form")
    public String form(){
        //logger.info("반환값체크리스타트 최신버전도");
        return "user/form";

    }
    //회원가입처리
    @PostMapping("/")
    private String createUser(@PathVariable KrUser krUser){
        logger.info("이벤트확인" + krUser.toString());
        //logger.info("파라미터값 " + krUser.toString());
        //userService.creatuser(krUser);

        return null;
        //return "redirect:/";
    }

}
