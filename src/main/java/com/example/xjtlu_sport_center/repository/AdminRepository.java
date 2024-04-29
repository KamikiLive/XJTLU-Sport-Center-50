package com.example.xjtlu_sport_center.repository;

import com.example.xjtlu_sport_center.model.Admin;
import com.example.xjtlu_sport_center.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // 可以添加一些根据应用需求的查询方法，例如：
    Optional<Admin> findByEmail(String email);

}
