package com.jiang.Method;

public class MethodTest02 {
    public static void main(String[] args) {
        int arr[] = {1,23,42,54,24,52};
        System.out.println(maxArr(arr));
    }

    //设计方法求数组最大值，并将最大值返回
    public static int maxArr(int arr[]){
        int max = arr[0];
        for (int i : arr) {
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}
