package com.cis.krchismvc.chkdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class UsertestController {
    //private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
    private static final Logger logger = LoggerFactory.getLogger(UsertestController.class);



    @Autowired
    private UsertestService userService;

    @GetMapping("/users")
    private String usertestlist(Model model){
        List<Usertest> userlist = userService.userList();

        model.addAttribute("userList",userlist);
        logger.info("반환값체크: " + userlist.get(0));

        return "/user/usertestlist";
    }

}
