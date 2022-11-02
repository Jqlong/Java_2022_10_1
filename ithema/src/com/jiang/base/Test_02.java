package com.jiang.base;

public class Test_02 {
    public static void main(String[] args) {
        /*从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过：过
	使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
        举例：
	1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过 18 ...
*/
        for (int i = 1; i < 100; i++) {
            //包含7或是7的倍数
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}
