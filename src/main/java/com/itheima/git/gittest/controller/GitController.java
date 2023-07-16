package com.itheima.git.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @GetMapping("/git")
    public String hello(){
        return "hello git";
    }
}
