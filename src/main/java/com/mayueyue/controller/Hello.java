package com.mayueyue.controller;

import com.mayueyue.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class Hello {

    public List<User> getUser(){
        return null;
    }

    @PostMapping(value = "/test",produces = "application/json")
    public User test(@RequestBody Map<String,Object> map){
        User user = new User();
        user.setAge(18);
        user.setId(1);
        user.setName(map.get("name").toString());
        return user;
    }

    @GetMapping("/tes21")
    public User tes21(@RequestParam String userName ){
        User user = new User();
        user.setAge(18);
        user.setId(1);
        user.setName(userName);
        return user;
    }



}
