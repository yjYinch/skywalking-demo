package com.skywalking.demo.service;

import com.skywalking.demo.entity.UserVO;

import java.util.List;

/**
 * @author : yj zhang
 * @since : 2021/9/17 11:25
 */
public interface UserService {
    List<UserVO> getAll();
}
