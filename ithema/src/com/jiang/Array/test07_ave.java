package com.jiang.Array;

import java.util.Random;

public class test07_ave {
    public static void main(String[] args) {
        //生成10个1-100的随机数存入数组

        //1.求出所有数据的和
        //2.求所有数据的平均数
        //3.统计有多少个数据比平均数小

        //生成随机数
        Random rm = new Random();

        int arr[] = new int[10];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(100)+1;
            System.out.print(arr[i] + " ");
            //计算和
            sum += arr[i];
        }
        System.out.println();
        //计算平均数
        //System.out.println(arr.toString());
        int average = sum/10;
        int count = 0;
        //统计比平均数小的个数
        for (int i : arr) {
            if (i < average){
                count ++;
            }
        }
        System.out.println(sum);
        System.out.println(average);
        System.out.println(count);

    }
}
