package com.jiang.Method;

public class MethodTest04 {
    public static void main(String[] args) {

        int arr[] = {1,3,5,6,7,8,23,43};
        int arr1[] = copyOfRange(arr,2,6);
        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
    //定义方法
    //将数组arr从from-to的元素复制到新数组中，并将数组返回
    public static int[] copyOfRange(int arr[],int from,int to){
        int len = to-from;
        int arr1[] = new int[len];
        for (int i = from,j = 0; i < to; i++,j++) {
            arr1[j] = arr[i];
        }
        return arr1;
    }
}
