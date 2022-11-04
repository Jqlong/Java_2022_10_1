package com.jiang.stringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //字符串反转
        //键盘录入
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = reverseArr(str);
        System.out.println(s);
    }

    private static String reverseArr(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i); //获取每个字符
            //拼接
            s.append(c);
        }
        return s.toString();
    }

}
