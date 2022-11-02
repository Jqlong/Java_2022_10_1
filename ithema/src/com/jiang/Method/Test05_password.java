package com.jiang.Method;

public class Test05_password {
    public static void main(String[] args) {

        //先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。

        //把整数里面的每一位放到数组当中
        int arr[] = {1,9,8,3};
        //加密

        for (int i = 0; i < arr.length; i++) {
            //每位加5
            arr[i] += 5;
            arr[i] %= 10;
        }
        /*for (int i : arr) {
            System.out.println(i);
        }*/
        //逆转
        for (int i = 0, j = arr.length - 1; i < j; i++, j --) {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }


        //把数组里面的每一个数字进行拼接，变成加密之后的结果

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res * 10 + arr[i];
        }
        System.out.println(res);
    }
}
