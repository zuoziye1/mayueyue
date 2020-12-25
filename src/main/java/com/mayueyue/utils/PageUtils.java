package com.mayueyue.utils;

import com.github.pagehelper.PageInfo;
import com.mayueyue.model.PageRequest;
import com.mayueyue.model.PageResult;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/24 2:30 下午
 * @Description:
 */
public class PageUtils {

    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param pageInfo
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
