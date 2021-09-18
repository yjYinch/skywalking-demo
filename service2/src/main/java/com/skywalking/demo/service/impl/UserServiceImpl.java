package com.skywalking.demo.service.impl;

import com.skywalking.demo.entity.UserVO;
import com.skywalking.demo.mapper.UserMapper;
import com.skywalking.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : yj zhang
 * @since : 2021/9/17 11:26
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserVO> getAll() {
        List<UserVO> allUsers = userMapper.getAll();
        LOGGER.info("获取全部用户{}", allUsers);
        return allUsers;
    }
}
