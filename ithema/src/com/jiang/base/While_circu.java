package com.jiang.base;

import java.util.Scanner;

public class While_circu {
    public static void main(String[] args) {

        //判断一个数字是否为回文
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //保存x的值
        int temp = num;

        //取位
        int res = 0;
        while(num > 0){
            //取每一位
            int a = num%10;
            //比较
            num = num/10;
            res = res * 10 + a;
        }
        //输出拼接的数字
        System.out.println(res);

        if (temp == res){
            System.out.println("回文");
        }
    }
}
