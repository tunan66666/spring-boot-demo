package com.tn666.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String helloSpringBoot() {
        return "Hello Spring Boot1";
    }

}
