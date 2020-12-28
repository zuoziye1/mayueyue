package com.mayueyue.model;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/17 7:46 下午
 * @Description:
 */
@Data
public class User {

    private long id ;

    private String name ;

    private int age ;

    private String password;

    private String role;

    private  String telephone;

    private String account;
}
