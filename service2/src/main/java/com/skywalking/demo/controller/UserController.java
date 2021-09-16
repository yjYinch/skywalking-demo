package com.skywalking.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangyijun
 * @date: created in 0:12 2021/9/17
 * @description
 */
@RestController
public class UserController {

    @GetMapping("/login")
    public String login(String username, String password) {
        // invoke B
        String url = "http://localhost:8002?username="+username + "&password=" + password;
        return url + "   OK ";
    }
}
