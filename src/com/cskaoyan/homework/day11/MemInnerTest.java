package com.cskaoyan.homework.day11;

//成员内部类对象依赖于它的外围类对象
//
//        > 定义一个类Dog
//        > 属性：age,name
//        > 除此之外,Dog类中需要定义一个成员内部类Body,Body类中有属性color
//        > 请私有化该成员内部类,然后将该成员内部类对象作为外围类的成员变量私有化。
//        > 最后在Dog类提供一个方法,展示Dog类的全部属性（age、name和color）
//        > 注意：
//        > 	既然定义成员内部类，就应该让外部感受不到这个内部类
//        > 	思考，如何在外部创建Dog类对象且给属性color赋值的情况下，实现这一点？

public class MemInnerTest {
    public static void main(String[] args) {
        new Dog("哮天犬", 2000, "黑色").show();

    }
}

class Dog {
    String name;
    int age;
    Body body = new Body();

    private class Body {
        String color;

        public void setColor(String color) {
            this.color = color;
        }
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        body.setColor(color);
    }

    public void show() {
        System.out.println("姓名:" + name + ",年龄:" + age + ",颜色:" + body.color);
    }
}
