package com.cskaoyan.homework.day09;

public class Student {
    int age;
    String name;
    int var;

    public Student() {

    }

    public Student(int age) {
        this.age = age;
    }

    

    public Student(String name, int age) {
        this(age);
        this.name = name;
    }
}
