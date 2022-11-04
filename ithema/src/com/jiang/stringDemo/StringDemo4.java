package com.jiang.stringDemo;

public class StringDemo4 {
    public static void main(String[] args) {
        //字符串拼接
        //定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法
        int[] arr = {1,2,3,4,5,6};

        String res = arrToString(arr);
        System.out.println(res);

    }

    public static String arrToString(int[] nums){
        //遍历数组
        String s = "";
        s += "[";
        for (int i = 0; i < nums.length; i++) {
            //判断是否为最后一个数
            if (i == nums.length - 1){
                s += nums[i];
            }else {
                s += nums[i] + ", ";
            }
        }
        s += "]";
        return s;
    }
}
