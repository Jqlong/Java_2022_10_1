package com.jiang.Method;

import java.util.Random;
import java.util.Scanner;

public class Test04_singGrade {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，
        // 请完成上述过程并计算出选手的得分。

        //定义一个数组，存储6位评委的打分
        int arr[] = new int[6];
        Random rm = new Random();
        for (int i = 0; i < 6; i++) {
            rm.nextInt(101);
        }

        //求出数组中最大的值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i > max){
                max = i;
            }
        }

        //求出数组中最小的值

        getScore();
        //计算
    }

    //用方法存储数组
    public static int[] getScore(){
        int score[] = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length;) {
            System.out.println("请输入评委的打分：");
            int s = sc.nextInt();
            if (s >= 0 && s <= 100){
                score[i] = s;
                i ++;
            }else {
                System.out.println("输入的分数非法，重新输入");
            }

        }
        return score;
    }
}
