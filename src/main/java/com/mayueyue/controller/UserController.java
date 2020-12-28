package com.mayueyue.controller;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 @Author: 马月月
  * @Date: 2020/12/28 15:09 下午
 * @Description:实现登录和注册
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

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
            userMapper.add(user);

        }

    }
    public void login(long userId,String account,String password){
        if(account.equals(account)&&password.equals(password)){
           //return "redirect:index.jsp";
            System.out.println("登录成功");

        }else{
            System.out.println("帐号或者密码错误");
        }

    }
}
