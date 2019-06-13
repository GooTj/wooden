package com.onepiece.wooden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WoodenApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoodenApplication.class, args);
    }

}
