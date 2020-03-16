package com.zlx.case12.event;

import com.zlx.case12.entity.User;
import org.springframework.context.ApplicationEvent;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/10 15:37
 * @Description:自定义事件
 */
public class MyEvent extends ApplicationEvent {

    private User user;

    public MyEvent(Object source,User user) {
        super(source);
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
