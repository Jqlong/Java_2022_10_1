package com.jiang.Method;

import java.util.Random;

public class Test07_lottery {
    public static void main(String[] args) {
        //抽奖
        //随机
        int arr[] = {2,588,888,1000,10000};
        //定义新数组，用于存放抽奖的结果
        int newArr[] = new int[arr.length];

        Random rm = new Random();
        //随机抽五次
        for (int i = 0; i < arr.length; ) {
            //获取随机索引
            int index = rm.nextInt(arr.length);

            int price = arr[index];
            //判断arr[index]是否存在;
            if(!contain(newArr,price)){
                //不存在
                //添加
                newArr[i] = price;
                i ++;
            }
        }
    }
    public static boolean contain(int arr[],int price){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price){
                //存在
                return true;
            }
        }
        //不存在
        //计算每个季度的总营业额
        int[][] two = {
                {1,3,5},
                {2,4,6}
        };
        return false;
    }
}
