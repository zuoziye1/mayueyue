package com.mayueyue.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mayueyue.mapper.UserMapper;
import com.mayueyue.model.PageRequest;
import com.mayueyue.model.PageResult;
import com.mayueyue.model.User;
import com.mayueyue.utils.PageUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/24 2:22 下午
 * @Description:
 */
@Service
public class PageHelperService {

    @Resource
    UserMapper userMapper ;


    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<User> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        //实现分页非常简单，service实现层调用dao(mapper)层之前进行page设置，mapper.xml中不处理分页，这样就够了，就能实现分页了
        PageHelper.startPage(pageNum, pageSize);
        List<User> sysMenus = userMapper.getUsers(10);
        return new PageInfo<User>(sysMenus);
    }
}
