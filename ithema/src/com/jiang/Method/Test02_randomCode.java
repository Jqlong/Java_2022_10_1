package com.jiang.Method;

import java.util.Random;

public class Test02_randomCode {
    public static void main(String[] args) {
        //需求：
        //定义方法实现随机产生一个5位的验证码
        //验证码格式：
        //长度为5
        //
        //前四位是大写字母或者小写字母
        //
        //最后一位是数字


        //分析：A-Z a-z
        //要在没有规律的随机抽数
        //先放在数组中，索引随机

        char chs[] = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25){
                chs[i] = (char)(97 + i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }
        }
        //随机抽取4次
        Random rm = new Random();
        String result = "";

        for (int i = 0; i < 4; i++) {

            int res = rm.nextInt(chs.length);
            result += chs[res];
//            System.out.println(chs[res]);
        }
//        System.out.println(result);

        //抽取数字
        int num = rm.nextInt(10);
        result += num;
        System.out.println(result);
    }
}
