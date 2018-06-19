package cloudgateway.coudgateway.mq;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MQConfig {
//
//    @Value("${spring.rabbitmq.template.exchange}")
//    public String EXCHANGE;
//
//    @Value("${spring.rabbitmq.host}")
//    public String HOST;
//
//    @Value(("${spring.rabbitmq.port}"))
//    public String PORT;
//
//    @Value("${spring.rabbitmq.virtual-host}")
//    public String VHOST;
//
//    @Value("${spring.rabbitmq.username}")
//    public  String USERNAME;
//
//    @Value("${spring.rabbitmq.password}")
//    public String PASSWORD;





    /*
     * 配置连接信息
     */
    @Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactory factory = new ConnectionFactory();
//        factory.setConnectionTimeout(5000);
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setVirtualHost("/");
        return factory;
    }
//
//    @Bean
//    public DirectExchange defaultExchange() {
//        return new DirectExchange(EXCHANGE, true, false);
//    }
//
    @Bean
    public Queue queue() {
        return new Queue("q1");
    }
}
