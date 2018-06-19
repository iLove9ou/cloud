package com.cloud.gateway.mq;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q1")
public class Consumer {

    @RabbitHandler
    public void process(String msg) {

        System.out.println("receive string...." + msg);

    }
}
