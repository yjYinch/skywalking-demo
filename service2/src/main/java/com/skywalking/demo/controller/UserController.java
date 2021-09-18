package com.skywalking.demo.controller;

import com.skywalking.demo.entity.UserVO;
import com.skywalking.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhangyijun
 * @date: created in 0:12 2021/9/17
 * @description
 */
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(String username, String password) {
        // invoke B
        String url = "http://localhost:8002?username="+username + "&password=" + password;
        return url + "   OK ";
    }

    @GetMapping("/user/get")
    public List<UserVO> getAll() {
        // invoke B
        LOGGER.info("服务2获取请求");
        return userService.getAll();
    }

    @GetMapping("/get")
    public String getWhenException() {
        List<UserVO> all = userService.getAll();
        int i = 0;
        int a = 1;
        int c = a/i;
        return "hello" + c;
    }
}
