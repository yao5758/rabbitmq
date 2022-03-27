package com.cy.rabbitmqprovider;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootTest(classes = RabbitmqProviderApplication.class)
public class TestRabbitMq {

    //注入rabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public  void  testHello(){
        //发送消息 参数1：队列的名称  参数2： 发送消息的内容
        //运行生产者并不会创建对应，需要有消费者才会去创建队列
        rabbitTemplate.convertAndSend("hello","hello world");
    }

    public void test(){
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
        Set<Object> set = Collections.synchronizedSet(new HashSet<>());
        set.add("");

        List<Object> list = new Vector<>();

        List<Object> objects = new CopyOnWriteArrayList<>();
    }
}

