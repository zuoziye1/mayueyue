package com.mayueyue;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.User;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: 马月月
 * @Date: 2020/12/28 15：21 下午
 * @Description:
 */
@SpringBootTest
public class Test2 {
    @Resource
    UserMapper userMapper;

    public void testRegist(long userId,String name,String account,String password,String telephone){
        User user=new User();

    }
}
