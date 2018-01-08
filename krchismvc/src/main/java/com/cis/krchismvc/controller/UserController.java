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

import javax.servlet.http.HttpSession;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    //회원가입폼
    @GetMapping("/form")
    public String form() {

        return "user/form";

    }

    //회원가입처리
    @PostMapping("/")
    private String createUser(KrUser krUser) {

        //logger.info("이벤트확인" + krUser.toString());
        logger.info("파라미터값 " + krUser.toString());

        userService.creatuser(krUser);

        return "redirect:/";
    }

    //회원목록
    @GetMapping("/")
    private String userList(Model model) {

        List<KrUser> userList = userService.userList();

        model.addAttribute("userList", userList);

        return "/user/userList";
    }

    //로그인폼
    @GetMapping("/loginform")
    private String loginForm() {
        return "user/login";
    }

    //로그인
    @PostMapping("/login")
    private String login(String userId, String password, String rememberChk, HttpSession session, Model model) {
        logger.info("로그인정보 :" + rememberChk );

        // rememberChk = checked 이면 아이디기역 쿠키생성하자
        KrUser krUser = userService.getUserinfo(userId);
        //사용자없으면
        if (krUser == null) {
            model.addAttribute("errorMsg", "사용자정보가 정확하지않습니다.");
            return "user/login";
        }
        //비번틀리면
        if (!krUser.getPassword().equals(password)) {
            model.addAttribute("errorMsg", "사용자장보가 정확하지않습니다.");
            return "user/login";
        }

        //로그인성공하면
        session.setAttribute(HttpSessionUtils.USER_SESSION_KEY, krUser);
//        Cookie cookie = new Cookie("userInputId", userId);
//        cookie.setMaxAge(7*24*60*60);
//        response.addCookie(cookie);

        //response.addCookie(new Cookie("login_save",""));


        return "redirect:/";
    }

    //로그아웃
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        //logger.info(session.getAttribute(HttpSessionUtils.USER_SESSION_KEY).toString());
        session.removeAttribute(HttpSessionUtils.USER_SESSION_KEY);
        return "redirect:/";
    }

    //개인정보수정폼 열기
    @GetMapping("/updateForm")
    public String updateForm(Model model,HttpSession session){
        if(!HttpSessionUtils.isLoginKruser(session)){
            model.addAttribute("errorMsg", "개인정보수정을위해 로그인해주세요");
            return "user/login";
        }
        KrUser sessionusered = HttpSessionUtils.getSessionedUser(session);

        KrUser dbKruser = userService.getUserinfobyId(sessionusered.getId());

        model.addAttribute("userinfo",dbKruser);
        return "user/updateForm";
    }

    //개인정보수정 저장
    @PostMapping("/updateUser")
    public String updateUser(KrUser krUser,HttpSession session,Model model){
        if(!HttpSessionUtils.isLoginKruser(session)){
            model.addAttribute("errorMsg", "개인정보수정을위해 로그인해주세요");
            return "user/login";
        }
        KrUser sessionusered = HttpSessionUtils.getSessionedUser(session);
        KrUser dbKruser = userService.getUserinfobyId(sessionusered.getId());

        if (!sessionusered.getId().equals(krUser.getId())){
            model.addAttribute("errorMsg", "로그인사용자의 아이디와 일치하지않습니다.");
            return "user/login";

        }

        Map<String, Object> paraMap = new HashMap<String, Object>();

        //업데이트 값이 변화된것만
        if (!dbKruser.getName().equals(krUser.getName())){
            paraMap.put("name",krUser.getName());
        }
        if (!dbKruser.getEmail().equals(krUser.getEmail())) {
            paraMap.put("email", krUser.getEmail());
        }
        //업데이트내역이있을때만
        if (paraMap.size() > 0){
            //업데이트필수컬럼
            paraMap.put("id",krUser.getId());
            paraMap.put("modifyid",sessionusered.getId());

            userService.updateUser(paraMap);
        }

        return "redirect:/";
    }

}
