package com.algorithm.test;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BagTest{
    public static void main(String[] args) {

        Bag<Double> bag = new Bag<Double>();

        while (!StdIn.isEmpty()){  //输入不为空
            bag.add(StdIn.readDouble()); //向背包中添加数据
        }
        int N = bag.size();  //统计背包中数据的个数

        double sum = 0.0;

        //迭代
        for (Double aDouble : bag) {
            sum += aDouble;
        }

        //求平均数
        double ave = sum / N;

        //求标准差
        sum = 0.0;
        for (Double aDouble : bag) {
            sum += (aDouble - ave) * (aDouble - ave); //平方差
        }

        //开根号
        double std = Math.sqrt(sum / (N - 1));
        StdOut.printf("Ave:%.2f\n",ave);
        StdOut.printf("Std:%.2f\n",std);
    }
}
