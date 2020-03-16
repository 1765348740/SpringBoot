package com.zlx.case11.service;

import com.zlx.case11.entity.User;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 17:00
 * @Description:
 */
public interface UserService {
    void isertUser(User user);
    void isertUser2(User user) throws Exception;
    void isertUser3(User user);
    void isertUser4(User user);
}
