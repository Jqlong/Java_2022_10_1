package com.jiang.Method;

public class Test06_passExtend {
    public static void main(String[] args) {


        //解密
        int arr[] = {8,3,4,6};
        //反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j --) {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }

        //算
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] += 10;
            }
        }
        //每位减五
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //拼接
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res * 10 + arr[i];
        }
        System.out.println(res);
    }
}
