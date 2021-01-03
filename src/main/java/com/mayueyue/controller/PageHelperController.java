package com.mayueyue.controller;

import com.mayueyue.model.PageRequest;
import com.mayueyue.model.PageResult;
import com.mayueyue.service.PageHelperService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * mybatis 分页插件 参考：https://cloud.tencent.com/developer/article/1448350
 *
 * 分页的实现原理：https://www.cnblogs.com/youzhibing/p/9603149.html
 *
 * @Author: 姚飞虎
 * @Date: 2020/12/24 2:21 下午
 * @Description:
 */
@RestController
public class PageHelperController {

    @Resource
    PageHelperService pageHelperService ;

    @RequestMapping("/getPageData")
    public PageResult getPageData(PageRequest pageRequest){
        return pageHelperService.findPage(pageRequest);
    }

    public void test(){
        // 多张表 问卷调查的信息   封装成了页面想要的数据结构
        /**
         *  id name status
         *
         *  1, 2,3 ,4
         *  1. 发短信 50 ms
         *  2. 清除redis 30 ms
         *
         *  3. 另外表 记录 count 10ms
         *
         *  4. 发送消息给其他系统 60 ms
         *
         *  异步
         *
         *
         */

        // 参数准备
        System.out.println("参数准备");
        pageHelperService.findPage(null);
        // 返回数据的准备
        System.out.println("返回数据的准备");
    }
}
