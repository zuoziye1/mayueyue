package com.mayueyue.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.BaseResult;
import com.mayueyue.model.PostDTO;
import com.mayueyue.model.User;
import com.mayueyue.model.UserRequest;
import com.mayueyue.service.UserService;
import com.mayueyue.日志打印.MyLog;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 马月月
 * @Date: 2020/12/28 15:09 下午
 * @Description:实现登录和注册
 */
@Slf4j
@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public void test() {
        System.out.println("-------------");
    }

    @RequestMapping("/register")
    public BaseResult register(String name, String account, String password, String telephone) {
        return userService.regist(name, account, password, telephone);

    }

    @RequestMapping("/login")
    public void login(String account, String password) {
        log.info("------>入参：account："+account + ",password:"+password);
        User user = userMapper.select(account, password);
        if (user != null) {
            System.out.println("登录成功");
        } else {
            System.out.println("fail");
        }
    }

    @Autowired
    private RedisTemplate<String, String> stringRedisTemplate;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    String key = "user_list";


    /**
     * redis 里面适合存放较长时间不变化的数据，且很多人看到的数据都是一样的，经常被访问的。
     * 如公司的主页信息，百度热榜推荐
     *
     * @param userRequest
     * @return
     */
    @MyLog(requied = true)
    @RequestMapping("/selectAll")
    public BaseResult<List> selectAll(UserRequest userRequest) {

        int offset = (userRequest.getPageNo() - 1) * userRequest.getPageSize();
        List<User> users ;
        users = (List<User>) redisTemplate.opsForValue().get(key);
        if (users == null) {
            users = userMapper.selectAll(offset, userRequest.getPageSize());
            redisTemplate.opsForValue().set("user_list", users);
        }
        BaseResult success = BaseResult.success();
        success.setData(users);
        return success;
    }


    /**
     * 当修改了redis里面对应的mysql的数据的时候，我们就需要删除redis对应的key
     * @param id
     * @param name
     * @return
     */
    @GetMapping("/updateId")
    public BaseResult updateId(long id,String name){
        if(id < 0 || StringUtils.isEmpty(name)){
            return BaseResult.success();
        }
        int i = userMapper.updateId(id, name);
        if(i > 0){
            redisTemplate.opsForValue().getOperations().delete(key);
        }
        return BaseResult.success();
    }


    public static void main(String[] args) {
        PostDTO postDTO = new PostDTO();
        postDTO.setBody("body");
        postDTO.setTitle("title");
        postDTO.setUserId(1);

        Gson gson = new Gson();
        String jsonResult = gson.toJson(postDTO);
        System.out.println(jsonResult);
    }

    public static int sum(int a, int b) {
        System.out.println("-------->");

        String test = "";
        int length = test.length();
        a = b * a / 2;

        /**
         * a = 3 , b = 2
         * a :  0011
         * b :  0010
         * ----------
         *      0011 === 3
         */
        b = b | a;
        return a + b;
    }

    public static int jianfa(int a, int b) {
        a = a * a;

        b = b * b;

        System.out.println("========");

        return a - b;
    }
}
