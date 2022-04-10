package com.cskaoyan.homework.day07.forbid;

/*定义一个Student类，并要求在其他类中，最多只能创建10个Student类的对象。
        分析：
        1，如果允许外部直接创建对象，显然无法控制创建对象的个数
        2，需要计数器指示外部创建对象的个数

*/

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println("创建对象："+Student.getInstance());
        }
    }
}

class Student {

    private static int count = 1;

    private String name;

    private int age;

    private Student() {

    }

    public void getNameAndAge() {
        System.out.println(name+age);
    }


    public static Student getInstance() {
        Student student = null;
        if (count <= 10) {
            student = new Student();
            System.out.println("第"+Student.count+"个学生");
            count++;
            return student;
        }
        System.out.println("失败");
        return student;

    }
}
