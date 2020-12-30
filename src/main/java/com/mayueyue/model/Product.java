package com.mayueyue.model;

import lombok.Data;

/**
 * @Author: 马月月
 * @Date: 2020/12/30 10:35
 * @Description:
 */
@Data
public class Product {
    private int id;
    private String pname;
    private double price;
    private long pnum;
    private double pdiscount;
    private  String begintime;
    private String endtime;
    private  int kucun;

}
