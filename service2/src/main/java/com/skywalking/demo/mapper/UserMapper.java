package com.skywalking.demo.mapper;

import com.skywalking.demo.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : yj zhang
 * @since : 2021/9/17 11:26
 */
@Mapper
public interface UserMapper {

    @Select(value = "SELECT id, name FROM user")
    List<UserVO> getAll();
}
