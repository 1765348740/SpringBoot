package com.zlx.case10.service;

import com.zlx.case10.entity.User;

import java.util.List;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 16:24
 * @Description:
 */
public interface UserService {

    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(Long id, String name);


}
