package com.cskaoyan.homework.day08;

/**
     提供以下两个动物需要描述，请用你的知识来编写代码
        猫：姓名，年龄，颜色，可以叫，可以抓老鼠
        狗：姓名，年龄，性别，可以叫，可以看门
    分析这个案例，设计出合适的继承体系。
    最后思考：人类研究出来了机器人，
            它们也有姓名，年龄，颜色等属性，可以套用本题中的继承体系吗？
*/

public class Inherittion {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",3,"Black");
        Dog dog = new Dog("哮天犬",1000,"Black");
        cat.catchMouse();
        cat.bark();
        dog.guardHouse();
        dog.bark();
    }


}

// Pat类 ： 姓名，年龄，可以叫
class Pat{
    String name;
    int age;
    String color;

    public Pat(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color=color;
    }

    public void bark(){
        System.out.println(this.name+"在叫");
    }
}

// 猫：姓名，年龄，颜色，可以叫，可以抓老鼠
class Cat extends Pat{
    // String name;
    // int age;
    // String color;

    // public void bark(){
    //     System.out.println(this.name+"在叫");
    // }
    public Cat(String name,int age,String color){
        super(name, age, color);
    }


    public void catchMouse(){
        System.out.println(this.name+"在抓老鼠！");
    }
}

// 狗：姓名，年龄，性别，可以叫，可以看门
class Dog extends Pat{
    // String name;
    // int age;
    // String color;

    // public void bark(){
    //     System.out.println(this.name+"在叫");
    // }

    public Dog(String name,int age,String color){
        super(name, age, color);
    }

    public void  guardHouse(){
        System.out.println(this.name+"在看家！");
    }
}