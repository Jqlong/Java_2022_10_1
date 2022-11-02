package com.algorithm.test;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] a = {12,4,2,6,85,41,32,56};
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        int key = 12;
        int low = 0;
        int high = a.length - 1;
        System.out.println(rank(key,a,low,high));
    }

    public static int rank(int key,int[] a,int low,int high){

        //递归二分法
        if (low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;

        if (key < a[mid]) {
            //左边
            return rank(key,a,low,mid -1);
        }else if (key > a[mid]){
            //右边
            return rank(key,a,mid + 1,high);
        }else {
            return mid;
        }

    }
}
