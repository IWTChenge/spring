package com.changshi.hello.spring.cloud.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient//表明自己是一个eureka client.
public class HelloSpringCloudClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudClient2Application.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi/{name}")//Rest full风格
    public String home(@PathVariable String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
