package com.zlx.case16.services;

import com.zlx.case16.dao.UserDao;
import com.zlx.case16.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/16 17:45
 * @Description:
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;


    public User getByUsername(String username) {

        return userDao.getByUsername(username);
    }

    public Set<String> getRoles(String username) {

        return userDao.getRoles(username);
    }

    public Set<String> getPermissions(String username) {

        return userDao.getPermissions(username);
    }
}
