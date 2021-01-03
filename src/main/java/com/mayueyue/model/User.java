package com.mayueyue.model;

import lombok.Data;

import java.io.Serializable;
import java.util.*;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/17 7:46 下午
 * @Description:
 */
@Data
public class User implements Serializable {

    private long id ;

    private String name ;

    private int age ;

    private String password;

    private String role;

    private  String telephone;

    private String account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(role, user.role) &&
                Objects.equals(telephone, user.telephone) &&
                Objects.equals(account, user.account);
    }


    public static void main(String[] args) throws CloneNotSupportedException {

        // 迭代器
        List<User> userList = new ArrayList<>();


        User user = new User(); // value - 1
        user.setTelephone("124");

        Object clone = user.clone();

        User user1 = new User(); // value - 1
        user1.setTelephone("124");




        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getTelephone());
        }

        Map<String,String> map = new HashMap<>();

        map.put("test","test-value-1");
        map.put("test","test-value-2");

        map.forEach(
                (k,v)->{
                    System.out.println(k);
                    System.out.println(v);
                }
        );

        System.out.println(user.equals(user1));
    }
}
