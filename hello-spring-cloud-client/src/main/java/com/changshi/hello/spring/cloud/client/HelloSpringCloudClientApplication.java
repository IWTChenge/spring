package com.changshi.hello.spring.cloud.client;

import com.sun.javafx.binding.StringFormatter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient//表明自己是一个eureka client.
public class HelloSpringCloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudClientApplication.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi/{name}")//Rest full风格
    public String home(@PathVariable String name) {
        return String.format("hi %s,i am from port: %s",name,port);
    }
}
