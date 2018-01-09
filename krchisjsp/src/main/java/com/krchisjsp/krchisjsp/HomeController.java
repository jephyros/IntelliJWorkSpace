package com.krchisjsp.krchisjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        System.out.println("바2로1뀌나Han222");
        return "index";
    }
}
