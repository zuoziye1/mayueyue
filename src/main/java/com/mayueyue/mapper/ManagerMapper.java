package com.mayueyue.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: 马月月
 * @Date: 2020/12/30 10:35
 * @Description:
 */
public interface ManagerMapper {
    /**
     * 查询都有哪些商品
     * @param  name
     * @return
     */
    int getall(String name);

    /**
     * 更新某个商品的库存
     * @param name
     * @return
     */
    int updateOne(@Param("name") String name,@Param("newpnum") int newpnum,@Param("newkucun") int newkucun);

    /**
     * 查询某个商品有多少条记录
     * @param name
     * @return
     */
    int checkName(String name);

    /**
     * 删除库存为0的商品
     * @param name
     * @return
     */

    int deleteOne(String name);

    /**
     * 查询商品的库存量
     * @param name
     * @param remain
     * @return
     */
   int selectCount(@Param("name") String name, @Param("remain") int remain);



}
