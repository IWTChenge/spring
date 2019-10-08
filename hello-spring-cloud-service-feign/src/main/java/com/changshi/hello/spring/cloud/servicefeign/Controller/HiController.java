package com.changshi.hello.spring.cloud.servicefeign.Controller;

import com.changshi.hello.spring.cloud.servicefeign.API.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String sayHi(@PathVariable String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}