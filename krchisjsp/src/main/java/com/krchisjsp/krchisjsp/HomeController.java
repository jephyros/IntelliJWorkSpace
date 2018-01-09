package com.krchisjsp.krchisjsp;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Authentication auth, Model model) {
        /*
        if (auth != null && auth.getName() != null) {
            model.addAttribute("message", "!!" + auth.getName() + " 님 환영합니다.");
        } else {
            model.addAttribute("message", "Welcome anonymous user");
        }
        */
        return "index";

    }
}
