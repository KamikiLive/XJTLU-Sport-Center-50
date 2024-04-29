package com.example.xjtlu_sport_center.controller;

import com.example.xjtlu_sport_center.model.Admin;
import com.example.xjtlu_sport_center.model.User;
import com.example.xjtlu_sport_center.repository.AdminRepository;
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

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/stulogin")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            // 登录成功，设置session
            session.setAttribute("user", user.get());
            return "index"; // 重定向到主页
        } else {
            return "stuLogin"; // 登录失败，返回登录页面
        }
    }

    @PostMapping("/admlogin")
    public String adminLogin(@RequestParam String email, @RequestParam String password, HttpSession session) {
        Optional<Admin> admin = adminRepository.findByEmail(email);
        if (admin.isPresent() && admin.get().getPassword().equals(password)) {
            // 登录成功，设置session
            session.setAttribute("admin", admin.get());
            return "index"; // 重定向到主页
        } else {
            return "stuLogin"; // 登录失败，返回登录页面
        }
    }
}
