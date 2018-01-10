package com.krchis.bootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user/form")
    public String userForm(){
        return "/user/form";
    }
}
