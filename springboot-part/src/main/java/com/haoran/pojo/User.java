package com.haoran.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "lhr.user")  // 方式2 批量配置读取，前缀
public class User {
    private int id;
    //@Value("${lhr.user.name}") 方式1 直接读取，只能读单个值(不推荐)
    private String name; //方式2 后缀等于key
    private String age;
    private String gender;
    private List<String> gfs;
}
