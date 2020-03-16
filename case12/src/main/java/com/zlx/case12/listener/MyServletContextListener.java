package com.zlx.case12.listener;

import com.zlx.case12.entity.User;
import com.zlx.case12.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.servlet.ServletContext;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/10 15:50
 * @Description:
 *                使用ApplicationListener来初始化一些数据到application域中的监听器
 */
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        // 先获取到application上下文
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        // 获取对应的service
        UserService userservice = applicationContext.getBean(UserService.class);
        User user = userservice.getUser2();
        // 获取application域对象，将查到的信息放到application域中
        ServletContext application = applicationContext.getBean(ServletContext.class);
        application.setAttribute("user", user);

    }
}
