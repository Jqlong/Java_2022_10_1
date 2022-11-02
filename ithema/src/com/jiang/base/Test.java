package com.jiang.base;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a);*/

        //switch语句新特性
        /*int number = 1;
        switch (number){
            case 1-> System.out.println("一");
            case 2-> System.out.println("二");
            case 3-> System.out.println("三");
            default -> System.out.println("无法");
        }*/

        //需求：键盘录入星期数，输出工作日、休息日。

        //(1-5) 工作日，(6-7)休息日。
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("错误");
                break;
        }
    }
}
