package com.zlx.case15.jms;

import com.zlx.case15.config.ActiveMqConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/10 18:17
 * @Description:   Topic消息消费者
 *
 */

    @Service
    public class TopicConsumer2 {

        /**
         * 接收订阅消息
         * @param msg
         */
        @JmsListener(destination = ActiveMqConfig.TOPIC_NAME, containerFactory = "topicListenerContainer")
        public void receiveTopicMsg(String msg) {
            System.out.println("收到的消息为：" + msg);
        }
}
