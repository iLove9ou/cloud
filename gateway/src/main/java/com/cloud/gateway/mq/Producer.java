package com.cloud.gateway.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    private static ThreadPoolExecutor poolExecutor = null;

    public void send() {

        /**
         * 线程池初始化方法
         *
         * corePoolSize 核心线程池大小----10
         * maximumPoolSize 最大线程池大小----30
         * keepAliveTime 线程池中超过corePoolSize数目的空闲线程最大存活时间----30+单位TimeUnit
         * TimeUnit keepAliveTime时间单位----TimeUnit.MINUTES
         * workQueue 阻塞队列----new ArrayBlockingQueue<Runnable>(10)====10容量的阻塞队列
         * threadFactory 新建线程工厂----new CustomThreadFactory()====定制的线程工厂
         * rejectedExecutionHandler 当提交任务数超过maxmumPoolSize+workQueue之和时,
         * 							即当提交第41个任务时(前面线程都没有执行完,此测试方法中用sleep(100)),
         * 						          任务会交给RejectedExecutionHandler来处理
         */
        System.out.println("..................start sending message...........................");
        poolExecutor = new ThreadPoolExecutor(10,
                30,
                30,
                 TimeUnit.MINUTES,
                 new ArrayBlockingQueue<Runnable>(10));

            String message = "hello";

            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
//                    while (true) {
//                        rabbitTemplate.convertAndSend("q1", message);
//                    }
                }
            });


        System.out.println(".......................end sending message............................");

    }
}
