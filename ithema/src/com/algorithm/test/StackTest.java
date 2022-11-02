package com.algorithm.test;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StackTest {
    public static void main(String[] args) {

        //新建栈
        Stack<Integer> stack = new Stack<Integer>();

        while(!StdIn.isEmpty()){
            //入栈
            stack.push(StdIn.readInt());
        }
        //迭代
        for (int integer : stack) {
            StdOut.println(integer);
        }
    }
}
