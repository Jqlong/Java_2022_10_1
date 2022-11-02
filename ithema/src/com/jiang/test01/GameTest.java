package com.jiang.test01;

public class GameTest {
    public static void main(String[] args) {

        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'女');

        /*while (true){
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getBlood() == 0){
                System.out.println("鸠摩智输了");
                break;
            }
            r2.attack(r1);

            if (r1.getBlood() == 0){
                System.out.println("乔峰输了");
                break;
            }
        }*/

        r1.showRoleInfo();
        r2.showRoleInfo();

    }
}
