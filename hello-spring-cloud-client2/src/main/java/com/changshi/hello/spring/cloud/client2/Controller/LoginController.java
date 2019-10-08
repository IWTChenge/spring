package com.changshi.hello.spring.cloud.client2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class LoginController {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(String name,String password){
        if("admin".equals(name)&"admin".equals(password)){
            return "true:"+port;
        }else {
            return "false:"+port;
        }
    }
}
