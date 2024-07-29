package com.haoran.controller;

import com.haoran.mapper.UserMapper;
import com.haoran.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Value("${lhr.user.name}")  // 读取自定义参数
    private String name;

    @GetMapping("hello")
    public String hello(){
        System.out.println(name);
        return "hello springboot3!!";
    }

    @Autowired
    private User user;

    @GetMapping("show")
    public User show(){
        return user;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("list")
    public List<User> list(){
        //数据库
        String sql ="select * from students;";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return list;
    }

    @Autowired
    private UserMapper userMapper;

    @GetMapping("delete")
    @Transactional  // 开启事务，特别简单
    public void delete(){
        int rows = userMapper.delete(1);
        System.out.println("rows = " + rows);
       // int i = 1/0;
    }

    @GetMapping("queryAll")
    @Transactional
    public List<User> queryAll(){
        return userMapper.queryAll();
    }
}
