package com.mayueyue.controller;

import com.mayueyue.mapper.ManagerMapper;
import org.apache.catalina.Manager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 马月月
 * @Date: 2020/12/30 14:20
 * @Description:
 */
@RestController
public class ManagerController {
    @Resource
    ManagerMapper managerMapper;

    @RequestMapping("/getAll")
    public void getAll(String name){
       int i=managerMapper.getall(name);
       if(i == 0){
           System.out.println("不存在该商品");

       }else{
           System.out.println();
       }



    }

}
