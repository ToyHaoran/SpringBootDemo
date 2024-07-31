package com.haoran.service;

import com.haoran.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

// 相比Mapper接口的CRUD，添加了批量方法，自动添加事务
public interface UserService extends IService<User> {
}
