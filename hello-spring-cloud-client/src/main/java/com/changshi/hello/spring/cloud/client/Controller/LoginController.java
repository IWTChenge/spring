package com.changshi.hello.spring.cloud.client.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public boolean login(String name,String password){
        if("admin".equals(name)&"admin".equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
