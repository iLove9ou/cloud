package cloudgateway.coudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoudGatewayApplication.class, args);
    }
}
