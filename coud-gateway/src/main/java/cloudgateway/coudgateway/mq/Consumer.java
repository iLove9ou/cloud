package cloudgateway.coudgateway.mq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q1")
public class Consumer {


    public void onMessage(Message message, Channel channel) throws Exception {

        System.out.println("receive message "+ message);
    }

    @RabbitHandler
    public void process(String msg) {

        System.out.println("receive string...." + msg);

    }
}
