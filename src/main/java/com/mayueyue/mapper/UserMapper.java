package com.mayueyue.mapper;

import com.mayueyue.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 *---------
 * @Author: 姚飞虎
 * @Date: 2020/12/17 7:30 下午
 * @Description:
 */
public interface UserMapper {


    User getNameById(long userId);
    int deleteById(long userId);
    List<User> getUsers(int age);
    List<User> regist(long userId,String name,String account,String password,String telephone);
    void add(User user);
    List<User> login(long userId,String account,String password);

    User select(@Param("account") String account,@Param("password") String password);
    List<User> seletAll(User user);

    int checkName(String name);

}
