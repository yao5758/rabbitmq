package com.cy.rabbitmqdemo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queueName") //监听queueName这个队列
public class ConsumerDemo {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  ===================: " + hello);
    }
}

