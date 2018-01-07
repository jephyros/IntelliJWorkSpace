package com.cis.krchismvc.controller;

import com.cis.krchismvc.repository.KrUser;
import com.cis.krchismvc.service.UserService;
import com.cis.krchismvc.util.HttpSessionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    //회원가입폼
    @GetMapping("/form")
    public String form(){

        return "user/form";

    }
    //회원가입처리
    @PostMapping("/")
    private String createUser(KrUser krUser){

        //logger.info("이벤트확인" + krUser.toString());
        logger.info("파라미터값 " + krUser.toString());

        userService.creatuser(krUser);

        return "redirect:/";
    }
    //회원목록
    @GetMapping("/")
    private String userList(Model model){

        List<KrUser> userList=  userService.userList();

        model.addAttribute("userList",userList);

        return "/user/userList";
    }
    //로그인폼
    @GetMapping("/loginform")
    private String loginForm(){
        return "user/login";
    }
    //로그인폼
    @PostMapping("/login")
    private String login(String userId, String password, HttpSession session,Model model){
        logger.info("로그인정보 " + userId +"/" + password);
        KrUser krUser = userService.getUserinfo(userId);
        //사용자없으면
        if (krUser ==null){
            model.addAttribute("errorMsg","사용자정보가 정확하지않습니다.");
            return "user/login";
        }
        //비번틀리면
        if (!krUser.getPassword().equals(password)){
            model.addAttribute("errorMsg","사용자장보가 정확하지않습니다.");
            return "user/login";
        }

        //로그인성공하면
        session.setAttribute(HttpSessionUtils.USER_SESSION_KEY,krUser);

        return "redirect:/";
    }
    //로그아웃
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        //logger.info(session.getAttribute(HttpSessionUtils.USER_SESSION_KEY).toString());
        session.removeAttribute(HttpSessionUtils.USER_SESSION_KEY);
        return "redirect:/";
    }

}
