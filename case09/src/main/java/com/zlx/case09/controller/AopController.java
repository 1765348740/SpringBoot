package com.zlx.case09.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 16:01
 * @Description:
 */
@RestController
@RequestMapping("/aop")
public class AopController {
    @GetMapping("/{name}")
    public String testAop(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/exception")
    public String testException() {
        int i = 1 / 0;
        return "success";
    }
}
