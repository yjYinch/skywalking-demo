package com.skywalking.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhangyijun
 * @date: created in 0:12 2021/9/17
 * @description
 */
@RestController
public class LoginController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/login")
    public String login(String username, String password) {
        // invoke B
        String url = "http://localhost:8002/service2/login?username="+username + "&&password=" + password;
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
