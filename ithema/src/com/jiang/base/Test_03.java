package com.jiang.base;

import java.util.Scanner;

public class Test_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        int index = 0;

        for (int i = 1; i < num; i++) {
            if (i * i == num){
                System.out.println(i + "为平方根");
                break;
            }else if (i * i > num){
                System.out.println((i - 1) + "为整数部分");
                break;
            }
        }
    }
}
