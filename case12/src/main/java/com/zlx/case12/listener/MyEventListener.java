package com.zlx.case12.listener;

import com.zlx.case12.entity.User;
import com.zlx.case12.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/10 15:45
 * @Description:
 *              自定义监听器，监听MyEvent事件
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        //把事件中的信息先获取到
        User user =myEvent.getUser();

        // 处理事件，实际项目中可以通知别的模块或者处理其他逻辑等等
        System.out.println("用户名：" + user.getUsername());
        System.out.println("密码：" + user.getPassword());
    }
}
