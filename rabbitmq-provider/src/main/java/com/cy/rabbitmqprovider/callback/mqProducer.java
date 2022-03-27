package com.cy.rabbitmqprovider.callback;

import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnsCallback;

//@Component  //这个也是回调方法   当前不用
public class mqProducer implements ConfirmCallback, ReturnsCallback {
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {

    }

    @Override
    public void returnedMessage(ReturnedMessage returnedMessage) {

    }
}
