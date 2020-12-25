package com.mayueyue;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/24 11:43 上午
 * @Description:
 */
@SpringBootTest
public class Test1 {

    @Resource
    UserMapper userMapper ;

    @Test
    public void test1(){
        List<User> users = userMapper.getUsers(10);
        System.out.println(users.size());
    }
}
