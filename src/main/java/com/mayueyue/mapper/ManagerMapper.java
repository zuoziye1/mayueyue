package com.mayueyue.mapper;

/**
 * @Author: 马月月
 * @Date: 2020/12/30 10:35
 * @Description:
 */
public interface ManagerMapper {
    /**
     * 查询都有哪些商品
     * @param name
     * @return
     */
    int getall(String name);

    /**
     * 更新某个商品的库存
     * @param name
     * @return
     */
    int updateOne(String name);



}
