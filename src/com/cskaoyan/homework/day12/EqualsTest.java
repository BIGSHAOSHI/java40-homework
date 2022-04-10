package com.cskaoyan.homework.day12;

public class EqualsTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", 2);
        Cat c2 = new Cat("Tom", 2);
        System.out.println("c1 == c2 结果:");
        System.out.println(c1 == c2);
        System.out.println("c1.getClass() == c2.getClass() 结果:");
        System.out.println(c1.getClass() == c2.getClass());
    }

}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}