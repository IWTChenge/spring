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
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/home/login")
    public boolean login(String name,String password){
        schedualServiceHi.sayHiFromClientOne(name);
        return login.login_home(name,password);
    }

}
