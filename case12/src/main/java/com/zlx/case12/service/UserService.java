package com.zlx.case12.service;

import com.zlx.case12.entity.User;
import com.zlx.case12.event.MyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/10 15:39
 * @Description:
 */
@Service
public class UserService {

    @Resource
    private ApplicationContext applicationContext;


    public User getUser2(){
        User user=new User(1L,"薛定谔的猫","12345678");
        // 发布事件
        MyEvent event = new MyEvent(this, user);
        applicationContext.publishEvent(event);
        return user;
    }
    /**
     * 获取用户信息
     * @return
     */
    public User getUser() {
        // 实际中会根据具体的业务场景，从数据库中查询对应的信息
        return new User(1L, "倪升武", "123456");
    }

}
