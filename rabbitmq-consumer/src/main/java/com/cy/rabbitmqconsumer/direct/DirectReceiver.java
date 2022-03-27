package com.cy.rabbitmqconsumer.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author : chenyao
 * @CreateTime : 2022/03/26
 * @Description : 直连交换机-消费者监听队列-消费消息
 **/
@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第一个DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}
