package com.jiang.Method;

import java.util.Scanner;

public class Test01_airplaneTicket {
    public static void main(String[] args) {
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        //

        //输入原价，月份，舱位
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int month = sc.nextInt();
        String rank = sc.nextLine();



        //按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
    }

    //计算票价

    public static int finPrice(int price,int month,String rank){
        //旺季
        return 0;
    }
}
