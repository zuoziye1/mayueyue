package com.mayueyue.controller;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.BaseResult;
import com.mayueyue.model.User;
import com.mayueyue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 @Author: 马月月
  * @Date: 2020/12/28 15:09 下午
 * @Description:实现登录和注册
 */
@RestController
public class UserController {

    @Resource
    UserService userService ;

    @RequestMapping("/register")
    public BaseResult register(String name, String account, String password, String telephone){
        return userService.regist(name,account,password,telephone);
    }

    public void login(String account,String password){
        User user=new User();
        if(account.equals(user.getAccount())&&password.equals(user.getPassword())){
            System.out.println("登陆成功");

        }else{
            System.out.println("登录失败");
        }



    }
}
