package com.learn.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "success";
    }
}
