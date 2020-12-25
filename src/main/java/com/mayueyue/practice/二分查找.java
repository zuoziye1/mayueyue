package com.mayueyue.practice;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/21 10:15 上午
 * @Description:
 */
public class 二分查找 {

    public static void main(String[] args) {
        int[] tmp = new int[]{1,3,5,7,9,10};
        int target = 10 ;

        int index = getTarget(tmp, target);
        System.out.println(index);
    }

    public static int getTarget(int[] tmp,int target){
        int start = 0 ;
        int end = tmp.length - 1;
        int tail = end ;

        int mid = 0 ;
        int midValue = 0 ;
        while (start <= tail){
            mid = (start + tail)/2 ;
            midValue = tmp[mid] ;
            if(midValue == target){
                return mid ;
            }

            if(target < midValue){
                tail = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return - 1 ;

    }
}
