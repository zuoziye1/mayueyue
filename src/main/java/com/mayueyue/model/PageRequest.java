package com.mayueyue.model;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/24 2:23 下午
 * @Description:
 */
@Data
public class PageRequest {

    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
}
