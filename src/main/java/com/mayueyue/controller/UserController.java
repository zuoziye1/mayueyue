package com.mayueyue.controller;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 @Author: 马月月
  * @Date: 2020/12/28 15:09 下午
 * @Description:实现登录和注册
 */
public class UserController {
    @Autowired
    private UserMapper userMapper;
    public void register(long userId,String name,String account,String password,String telephone){

        if(name.equals(name)){
            System.out.println("你注册的昵称已经存在");

        }else{
            User user=new User();
            user.getId();
            user.getName();
            user.getPassword();
            user.getTelephone();
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
