package com.zuilizhehua.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "bs/user")
public class LoginController {

    @PostMapping("login")
    public void login(){
        System.out.println("登录了");
    }
}