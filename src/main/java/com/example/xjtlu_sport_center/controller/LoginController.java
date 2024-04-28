package com.example.xjtlu_sport_center.controller;

import com.example.xjtlu_sport_center.model.User;
import com.example.xjtlu_sport_center.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/stulogin")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            // 登录成功，设置session
            session.setAttribute("user", user.get());
            return "adminLogin"; // 重定向到主页
        } else {
            return "adminLogin"; // 登录失败，返回登录页面
        }
    }
}
