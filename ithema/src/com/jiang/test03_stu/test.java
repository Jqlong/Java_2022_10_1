package com.jiang.test03_stu;

public class test {
    public static void main(String[] args) {
        //定义数组存储3个学生对象。
        Student[] students = new Student[3];

        //学生的属性：学号，姓名，年龄。
        Student s1 = new Student(1,"long",22);
        Student s2 = new Student(2,"xi",21);
        Student s3 = new Student(3,"wen",20);

        Student s5 = new Student();

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //要求1：添加的时候需要进行学号的唯一性判断。
        Student s4 = new Student(4,"li",18);
        boolean flag = addStu(students,s4);
        if (flag){
            System.out.println("改学号已存在");
        }else {
            //不存在
            int count = stuCount(students);
            //如果数组满了
            if (count == students.length){
                //创建新数组
                Student[] newStu = creatStu(students);
                newStu[count] = s4;
            }else {
                //数组没满
                //直接添加进去
                students[count] = s4;
            }

        }
        //要求2：添加完毕之后，遍历所有学生信息。

        //要求3：通过id删除学生信息

        //如果存在，则删除，如果不存在，则提示删除失败。

        //要求4：删除完毕之后，遍历所有学生信息。

        //要求5：id为2的学生，年龄+1岁
    }

    //添加学生，并进行唯一性检查
    public static boolean addStu(Student[] stu,Student s){
        for (int i = 0; i < stu.length; i++) {
            //如果有id相同则返回true
            if (stu[i].getId() == s.getId()){
                return true;
            }
        }
        return false;
    }

    //获取数组中的元素个数
    public static int stuCount(Student[] stu){
        int count  = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null){
                count ++;
            }
        }
        return count;
    }

    //创建新数组
    public static Student[] creatStu(Student[] stu){
        Student[] newStu = new Student[stu.length + 1];
        //复制数组
        for (int i = 0; i < stu.length; i++) {
            newStu[i] = stu[i];
        }
        //返回新数组
        return newStu;
    }
}
