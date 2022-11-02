package com.algorithm.test;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class QueueTest {
    public static void main(String[] args) {

        for (int i : readInts("I:\\Java_2022_10_1\\ithema\\src\\test")) {
            System.out.println(i);
        }

    }

    //读文件
    public static int[] readInts(String name){
        In in = new In(name);
        //创建队列
        Queue<Integer> queue = new Queue<Integer>();

        //入队列
        while (!in.isEmpty()){ //不为空时
            queue.enqueue(in.readInt());
        }

        int n = queue.size(); //队列大小
        int[] a = new int[n]; //创建数组
        for (int i = 0; i < a.length; i++) {
            //添加元素
            a[i] = queue.dequeue();
        }
        return a;
    }
}
