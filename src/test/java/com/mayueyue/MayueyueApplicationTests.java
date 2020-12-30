package com.mayueyue;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mayueyue.mapper.ManagerMapper;
import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.PostDTO;
import com.mayueyue.model.User;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class MayueyueApplicationTests {

    @Resource
    UserMapper userMapper;

    @Resource
    ManagerMapper managerMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        System.out.println("---------->mayueyue");

        User nameById = userMapper.getNameById(1);
        System.out.println(nameById);
    }
    @Test
    public void tesdelete(){
        System.out.println("删除成功");
        userMapper.deleteById(3);
    }

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void set(){
        redisTemplate.opsForValue().set("myKey","myValue");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
    }


}
