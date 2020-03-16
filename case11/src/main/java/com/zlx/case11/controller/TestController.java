package com.zlx.case11.controller;

import com.zlx.case11.entity.User;
import com.zlx.case11.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 17:02
 * @Description:
 */
@RestController
public class TestController {
    @Resource
    private UserService userService;
    /**
     * 正常测试
     * @param
     * @return
     */
    @PostMapping("/adduser")
    public String addUser() throws Exception {
        User user = new User();
        user.setId(8);
        user.setUsername("scsdcdsc");
        user.setPassword("23232323232323232323232322323");
        if (null != user) {
            userService.isertUser(user);
            return "success";
        } else {
            return "false";
        }
    }

    /**
     * 测试异常并没有被捕获到
     * @param user
     * @return
     * @throws Exception
     */
    @PostMapping("/adduser2")
    public String addUser2(@RequestBody User user) throws Exception {
        if (null != user) {
            userService.isertUser2(user);
            return "success";
        } else {
            return "false";
        }
    }

    /**
     * 测试异常被吃掉
     * @param user
     * @return
     * @throws Exception
     */
    @PostMapping("/adduser3")
    public String addUser3(@RequestBody User user) {
        if (null != user) {
            userService.isertUser3(user);
            return "success";
        } else {
            return "false";
        }
    }
}
