package com.cskaoyan.homework.day05;

/**
 * since 2022/3/25 20:27
 * authored by BIGSHAOSHI
 ***/

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张三", 18, "男", 1);
        Teacher t2 = new Teacher("李四", 24, "女", 2);
        t1.print();
        t2.print();
    }
}

class Teacher {

    String name;
    int age;
    String gender;
    int teacherId;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Teacher(String name, int age, String gender, int teacherId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacherId = teacherId;
    }

    public void print(){
        System.out.print("Name:"+this.name);
        System.out.print("  Age:"+this.age);
        System.out.print("  Gender:"+this.gender);
        System.out.println("  TeacherID:"+this.teacherId);
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
}
