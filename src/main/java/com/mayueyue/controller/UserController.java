package com.mayueyue.controller;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.BaseResult;
import com.mayueyue.model.User;
import com.mayueyue.model.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 @Author: 马月月
  * @Date: 2020/12/28 15:09 下午
 * @Description:实现登录和注册
 */
@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/")
    public void test(){
        System.out.println("-------------");
    }

    @RequestMapping("/register")
    public void register(long userId,String name,String account,String password,String telephone){
        // 判断数据库里是否有这个名字
        int count = userMapper.checkName(name);

        if(count > 0){
            System.out.println("你注册的昵称已经存在");

        }else{
            User user=new User();
            user.setName(name);
            user.setPassword(password);
            user.setTelephone(telephone);
            user.setAccount(account);
            userMapper.add(user);
        }

    }

    @RequestMapping("/login")
    public void login(String account,String password){
        User user = userMapper.select(account, password);
        if(user != null){
          System.out.println("登录成功");
      }else{
          System.out.println("fail");
      }
    }

    @RequestMapping("/selectAll")
    public BaseResult<List> selectAll(UserRequest userRequest){
        int offset = ( userRequest.getPageNo() - 1 ) * userRequest.getPageSize();
        List<User> users = userMapper.selectAll(offset,userRequest.getPageSize());
        BaseResult success = BaseResult.success();
        success.setData(users);
        return success;
    }


    public static void main(String[] args) {
        int sum = sum(3, 2);
        System.out.println(sum);
        int jianfa = jianfa(3, 5);
        System.out.println(jianfa);

    }

    public static int sum(int a,int b){
        System.out.println("-------->");

        String test = "";
        int length = test.length();
        a = b * a /  2 ;

        /**
         * a = 3 , b = 2
         * a :  0011
         * b :  0010
         * ----------
         *      0011 === 3
          */
        b = b | a ;
        return a + b ;
    }

    public static int jianfa(int a , int b){
        a = a * a ;

        b = b * b ;

        System.out.println("========");

        return a - b ;
    }
}
