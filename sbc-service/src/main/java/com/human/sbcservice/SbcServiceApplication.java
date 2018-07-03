package com.human.sbcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbcServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbcServiceApplication.class, args);
    }
}
