package com.haoran.mapper;

import com.haoran.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> queryAll();

    int delete(int i);
}
