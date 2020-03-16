package com.zlx.case16.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/16 18:04
 * @Description:
 */
@Controller

public class IndexController {
    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/unauthorized")
    public String unauthorized() {

        return "unauthorized";
    }
}
