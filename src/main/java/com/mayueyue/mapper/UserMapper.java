package com.mayueyue.mapper;

import com.mayueyue.model.User;
import org.springframework.stereotype.Repository;

/**
 *---------
 * @Author: 姚飞虎
 * @Date: 2020/12/17 7:30 下午
 * @Description:
 */
public interface UserMapper {


    User getNameById(long userId);
    int deleteById(long userId);
}
