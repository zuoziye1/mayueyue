package com.mayueyue.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/24 2:23 下午
 * @Description:
 */
@Data
public class PageResult {

    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 数据模型
     */
    private List<?> content;
}
