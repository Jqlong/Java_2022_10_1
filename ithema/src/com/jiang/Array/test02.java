package com.jiang.Array;

public class test02 {
    public static void main(String[] args) {

        int arr[] = {1,3,5,2};

        int num = arr[0];
        int sum = 0;
        System.out.println(num);
        for (int i : arr) {
            sum+=i;
            //System.out.println(i);

        }
        System.out.println(sum);
    }
}
