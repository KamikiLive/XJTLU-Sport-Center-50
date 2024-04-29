package com.example.xjtlu_sport_center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "stuLogin";
    }

    @GetMapping("/adminlogin")
    public String login() {
        return "adminLogin";
    }

    @GetMapping("/stulogin")
    public String login1() {
        return "stuLogin";
    }

    @GetMapping("/index.html")
    public String pgCon1() {
        return "index";
    }

    @GetMapping("/explore.html")
    public String pgCon2() {
        return "explore";
    }

    @GetMapping("/rooms.html")
    public String pgCon3() {
        return "rooms";
    }

    @GetMapping("/bb.html")
    public String pgCon4() {
        return "bb";
    }

    @GetMapping("/contact.html")
    public String pgCon5() {
        return "contact";
    }
}

