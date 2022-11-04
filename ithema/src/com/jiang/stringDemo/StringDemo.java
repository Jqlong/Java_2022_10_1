package com.jiang.stringDemo;

import java.util.Objects;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = "abc";

        //遍历
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            System.out.println(c);
        }

    }
}
