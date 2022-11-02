package com.jiang.Array;

public class test06_maxNum {
    public static void main(String[] args) {

        int arr[] = {33,5,99,44,55};

        //找出最大元素并打印

        //max的值一定要是数组中的数字
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
