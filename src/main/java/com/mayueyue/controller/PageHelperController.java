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
}
