package com.mayueyue.service;

import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.BaseResult;
import com.mayueyue.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 操作数据库和业务逻辑的
     * @param name
     * @param account
     * @param password
     * @param telephone
     */
    public BaseResult regist(String name, String account, String password, String telephone){
        BaseResult baseResult = new BaseResult<>();
        int count = userMapper.checkName(name);

        // 判断数据库里是否有这个名字
        if(count > 0){
            baseResult.setCode(1);
            System.out.println("你注册的昵称已经存在");
            baseResult.setMsg("你注册的昵称已经存在");
            return baseResult;
        }else{
            User user=new User();
            user.setName(name);
            user.setPassword(password);
            user.setTelephone(telephone);
            user.setAccount(account);
            userMapper.add(user);
        }
        return BaseResult.success();
    }
}
