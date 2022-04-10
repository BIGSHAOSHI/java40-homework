package com.cskaoyan.homework.day06;

/**
 * @author 王世杰
 * @created 2022/3/26 12:37
 */

public class Demo {
    public static void main(String[] args) {
        // 注意不要同时放开两个new语句，避免互相影响
        // debug语句一，可以进入查看age的赋值过程
        Person p = new Person(18);
        // debug语句二，进入查看nationality赋值过程
        // Person p2 = new Person("中国");
        p.getAge();
    }
}
class Person {
    int age = 10;
    static String nationality = "美国"; //类加载

    public Person(int age) {
        this.age = age;
    }


    public Person() {
    }

    public Person(String nationality) {
        Person.nationality = nationality; //创建对象
    }

    public void getAge() {
        System.out.println(this.age);
    }
}