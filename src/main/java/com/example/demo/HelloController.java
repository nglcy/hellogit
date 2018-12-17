package com.example.demo;

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
}
