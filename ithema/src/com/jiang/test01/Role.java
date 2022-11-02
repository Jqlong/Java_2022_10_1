package com.jiang.test01;

import java.util.Random;

public class Role {

    private String name;
    private int blood;

    private char gender;
    private String face;

    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};



    public Role() {
    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {

        return face;
    }

    public void setFace(char gender) {

        Random rm = new Random();

        //随机面字
        if (gender == '男'){

            int rf = rm.nextInt(boyfaces.length);
            this.face = boyfaces[rf];
        }else if (gender == '女'){
            int index=  rm.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "眉清目秀";
        }

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击方法
    public void attack(Role role){
        //随机血量
        Random rm = new Random();
        int attackBlood = rm.nextInt(20) + 1; //随机1-20的伤害
        int remainBlood = role.getBlood() - attackBlood; //剩余血量
        //判断血量是否小于零
        if (remainBlood < 0){
            remainBlood = 0;
        }

        //修改血量
        role.setBlood(remainBlood);


        System.out.println(this.getName() +  "攻击了"+ role.getName() +"，造成了"+ attackBlood +"点伤害，" + role.getName() + "还剩下" + remainBlood + "点血量！");

    }

    //展示角色信息
    public void showRoleInfo(){
        System.out.println("姓名为：" + this.getName());
        System.out.println("血量为：" + this.getBlood());
        System.out.println("性别为：" + this.getGender());
        System.out.println("颜值为：" + this.getFace());
    }
}
