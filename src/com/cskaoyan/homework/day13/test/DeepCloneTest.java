package com.cskaoyan.homework.day13.test;

/*
    分别定义以下类：
         教师类 Teacher
         属性：int age;String name;Student stu
         学生类 Student
         属性：int age；String name；Star s
         明星类 Star
         属性：int age，String name

         尝试完成Teacher对象的深度克隆，并写代码进行测试
*/


public class DeepCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Star s1 = new Star(21, "迪丽热巴");
        Student stu1 = new Student(18, "王世杰", s1);
        Teacher t1 = new Teacher(41, "长风", stu1);

        Teacher cloneT1 = t1.clone();
        System.out.println("t1 == cloneT1 : "+(t1 == cloneT1));
        System.out.println(t1.toString());
        System.out.println(cloneT1.toString());
        System.out.println(t1.stu);
        System.out.println(cloneT1.stu);
        System.out.println(t1.stu.s);
        System.out.println(cloneT1.stu.s);



    }
}

class Teacher implements Cloneable {
    int age;
    String name;
    Student stu;

    public Teacher(int age, String name, Student stu) {
        this.age = age;
        this.name = name;
        this.stu = stu;
    }

   /* @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }*/

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        Teacher cloneTeacher = (Teacher) super.clone();
        Student cloneStu = stu.clone();
        cloneTeacher.stu = cloneStu;
        return cloneTeacher;
    }
}

class Student implements Cloneable {
    int age;
    String name;
    Star s;

/*    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", s=" + s +
                '}';
    }*/

    public Student(int age, String name, Star s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student cloneStu = (Student) super.clone();
        Star cloneStar = s.clone();
        cloneStu.s = cloneStar;
        return cloneStu;
    }
}

class Star implements Cloneable {
    int age;
    String name;

    public Star(int age, String name) {
        this.age = age;
        this.name = name;
    }

/*    @Override
    public String toString() {
        return "Star{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }*/

    @Override
    protected Star clone() throws CloneNotSupportedException {
        return ((Star) super.clone());
    }

}