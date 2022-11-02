package com.jiang.Array;

public class test04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //如果是奇数，当前数字扩大两倍
        //如果是偶数，当前数字缩小一倍
        for (int i : arr) {
            if (i % 2 == 0){
                //偶数少一倍
                i /= 2;
            }else{
                i *= 2;
            }
            System.out.println(i);
        }
    }
}
