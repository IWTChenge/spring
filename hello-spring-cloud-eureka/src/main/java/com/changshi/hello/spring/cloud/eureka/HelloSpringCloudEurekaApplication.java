package com.changshi.hello.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//表示是个注册中心
public class HelloSpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudEurekaApplication.class, args);
    }

}
