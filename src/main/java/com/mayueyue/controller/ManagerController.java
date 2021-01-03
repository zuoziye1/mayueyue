package com.mayueyue.controller;

import com.mayueyue.mapper.ManagerMapper;
import com.mayueyue.model.Product;
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
    @RequestMapping("/updateOne")
    public void updateOne(String name,int newpnum,int newkucun){
        //判断输入的名字是否存在数据库中
        int count = managerMapper.checkName(name);
        if(count<0){
            System.out.println("你更新的商品不存在");

        }else{
            managerMapper.updateOne(name,newpnum,newkucun);
        }


    }



    @RequestMapping("/deleteOne")
    public void deleteOne(String name,int remain){
        int i = managerMapper.selectCount(name,remain);
        if(i==0){
            managerMapper.deleteOne(name);
        }
        System.out.println("删除成功");



}
}
