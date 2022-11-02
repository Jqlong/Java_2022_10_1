package com.jiang.OOP;

public class Test01 {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();

        p.setBrand("xiaomi");
        p.setPrice(2300);

/*
        p.brand = "xiaomi";
        p.price = 2300;
*/

        System.out.println(p.getBrand());
        System.out.println(p.getPrice());

        p.call();
        p.playGame();
    }
}
