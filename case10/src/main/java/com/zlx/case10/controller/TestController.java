package com.zlx.case10.controller;

import com.zlx.case10.entity.User;
import com.zlx.case10.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 16:27
 * @Description:
 */
@RestController
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {

        return userService.getUser(id);
    }

    @RequestMapping("/getUser/{id}/{name}")
    public User getUser(@PathVariable Long id, @PathVariable String name) {
        return userService.getUser(id, name);
    }

    @RequestMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/getUserByName/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);

    }


}