package com.example.demo;

import com.example.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 * @description {用一话描述该类}
 * @date 2018/12/17
 */


@RestController

public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello git ";
    }

    @RequestMapping("hello1")
    public String hello1(){
        User user = new User();
        user.setId(123);
        user.setUsername("牛珪灵");
        user.setPassword("123");
        return "hello1 git"+user.getUsername();
    }
}
