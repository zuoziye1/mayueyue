package com.mayueyue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.util.DigestUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


import java.time.Instant;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/18 7:16 下午
 * @Description:
 */
@SpringBootTest
public class Test {

    @Autowired
    RestTemplate restTemplate;


}
