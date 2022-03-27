package com.cy.rabbitmqdemo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ProducerDemo {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("/send")
    @ResponseBody
    public String send() {
        String context = "hello==========" + new Date();
        //往"queueName"队列里面发送消息（先在mq的控制台创建一个queueName队列）
        this.rabbitTemplate.convertAndSend("queueName", context);
        return "success";
    }
}

