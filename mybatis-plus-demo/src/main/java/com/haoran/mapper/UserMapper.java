package com.haoran.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haoran.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    //定义方法，基本的方法不用写XxxMapper.xml文件了。

    //自定义方法还是需要写xml文件。定义一个根据年龄参数查询，并且分页的方法 age > xx
    IPage<User> queryByAge(IPage<User> page, @Param("age") Integer age);


}
