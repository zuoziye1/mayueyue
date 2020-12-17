package com.mayueyue.mapper;

import com.mayueyue.model.User;
import org.springframework.stereotype.Repository;

/**
 *---------trtrtrt 5454
 * @Author: 姚飞虎
 * @Date: 2020/12/17 7:30 下午
 * @Description:
 */
public interface UserMapper {

    User getNameById(long userId);
}
