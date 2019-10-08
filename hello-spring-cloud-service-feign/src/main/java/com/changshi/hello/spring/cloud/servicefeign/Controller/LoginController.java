package com.changshi.hello.spring.cloud.servicefeign.Controller;
import com.changshi.hello.spring.cloud.servicefeign.API.Login;
import com.changshi.hello.spring.cloud.servicefeign.API.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private Login login;
    @RequestMapping(value = "/home/login")
    public String login(String name,String password){
        return login.login_home(name,password);
    }

}
