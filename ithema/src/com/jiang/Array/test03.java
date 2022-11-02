package com.jiang.Array;

public class test03 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        //遍历数组得到每一个元素，统计数组里面一共又多少个能被3整除的数字
        int count = 0;
        for (int i : arr) {
            //能被3整除
            if (i % 3 == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
