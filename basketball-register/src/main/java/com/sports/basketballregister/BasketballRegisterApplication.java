package com.sports.basketballregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BasketballRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasketballRegisterApplication.class, args);
    }

}
