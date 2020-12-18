package com.mayueyue;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MayueyueApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        System.out.println("---------->mayueyue");

        User nameById = userMapper.getNameById(1);
        System.out.println(nameById);
    }
    @Test
    public void tesdelete(){
        System.out.println("删除成功");
        userMapper.deleteById(3);

    }

}
