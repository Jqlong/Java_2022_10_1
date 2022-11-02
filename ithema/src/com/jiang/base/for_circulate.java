package com.jiang.base;

import java.util.Scanner;

public class for_circulate {
    public static void main(String[] args) {
        //for循环
        /*for(int i =1;i <= 5;i++){
            System.out.println("第" + i + "次执行断线重连的业务");
        }*/
        //循环1-5得到里面的每一个数字
        //开始条件：1
        //结束条件：5
        //求和变量不能定义在
        /*int sum = 0;
        for (int i = 1;i <= 5;i ++){
            System.out.println(i);
            sum+=i;

        }
        System.out.println(sum);*/


        //求0-100的偶数和
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                sum+=i;
            }
        }
        System.out.println(sum);


        //键盘录入两个数字，表示一个范围
        //既能被3整除，也能被5整除的个数

        Scanner sc = new Scanner(System.in);
        //两个数
        int firstNum = sc.nextInt();
        int lastNum = sc.nextInt();
        //统计
        int count = 0;
        //判断两个数谁大
        if (firstNum <= lastNum){
            for (int i = firstNum; i <= lastNum ; i++) {
                //判断是否符合要求
                if (i %3 == 0 && i % 5 == 0){
                    count ++;
                }
            }
        }else {
            for (int i = lastNum; i < firstNum; i++) {
                //判断是否符合要求
                if (i %3 == 0 && i % 5 == 0){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
