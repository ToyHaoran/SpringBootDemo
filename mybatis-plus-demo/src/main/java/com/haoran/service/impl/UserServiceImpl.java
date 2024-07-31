package com.haoran.service.impl;

import com.haoran.mapper.UserMapper;
import com.haoran.pojo.User;
import com.haoran.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
