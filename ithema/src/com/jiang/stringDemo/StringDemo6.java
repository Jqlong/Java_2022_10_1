package com.jiang.stringDemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入金额，判断合法性
        Scanner sc = new Scanner(System.in);
        int money;
        while (true){
            money = sc.nextInt();
            if (money >= 0 && money <= 99999){
                break;
            }else {
                System.out.println("金额不合法！");
            }
        }
        System.out.println(money);
    }

    //定义一个方法，把数字变成大写的中文
    public static String getCaptionNumber(int number){
        //定义数组
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];

    }
}
