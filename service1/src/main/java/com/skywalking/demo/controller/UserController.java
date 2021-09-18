package com.skywalking.demo.controller;

import com.skywalking.demo.entity.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : yj zhang
 * @since : 2021/9/17 11:20
 */
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/get")
    public List<UserVO> getAll() {
        String url = "http://localhost:8002/service2/user/get";
        LOGGER.info("请求服务2的url={}", url);
        List<UserVO> userVOList = restTemplate.getForObject(url, List.class);
        return userVOList;
    }

    @GetMapping("/get")
    public String getException() {
        String url = "http://localhost:8002/service2/get";
        String res = restTemplate.getForObject(url, String.class);
        return res;
    }
}
