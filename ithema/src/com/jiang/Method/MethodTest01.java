package com.jiang.Method;

public class MethodTest01 {
    public static void main(String[] args) {

        //设计方法遍历数组，要求遍历的结果在一行上。
        int arr[] = {1,3,4,5,6,7};
        printArr(arr);
    }

    public static void printArr(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
    }
}
