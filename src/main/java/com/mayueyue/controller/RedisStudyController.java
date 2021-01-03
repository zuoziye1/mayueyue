package com.mayueyue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RedisStudyController {

    private Map<String,String > amp ;

    /**
     *
     */
    @RequestMapping("/testStringRedis")
    public void testStringRedis(long uid){

        /**
         * 某个页面有一个点赞机制，给某个人点赞，但是呢，每个人每天只能点一次，
         * 我们用redis 来记录状态。记录某种状态的情况我们都可以放在redis
         */

        /**
         * 场景演示：
         * zset , list ，string ,set ,
         *
         */

    }



}
