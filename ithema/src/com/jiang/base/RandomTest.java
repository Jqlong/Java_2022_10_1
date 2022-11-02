package com.jiang.base;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        Random rm = new Random();

        //从0开始，到99结束，包左不包右
        int num = rm.nextInt(100);

        while(true){
            Scanner sc = new Scanner(System.in);
            int res = sc.nextInt();
            if (res > num){
                System.out.println("猜大了");
            }else if(res < num){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }

    }
}
