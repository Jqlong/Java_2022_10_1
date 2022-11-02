package com.jiang.Method;

public class MethodTest03 {
    public static void main(String[] args) {

        int arr[] = {1,3,4,6,7,123,54};
        int index = indexArr(arr,54);
        System.out.println(index);

    }
    //判断数组中的某个数是否存在
    public static int indexArr(int arr[],int e){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e){
                return i;
            }
        }
        return -1;
    }
}
