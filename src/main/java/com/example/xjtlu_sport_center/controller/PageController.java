package com.example.xjtlu_sport_center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/adminlogin")
    public String login() {
        return "adminLogin"; // 返回 login.html 模板
    }

    @GetMapping("/stulogin")
    public String login1() {
        return "index"; // 返回 login.html 模板
    }
}

