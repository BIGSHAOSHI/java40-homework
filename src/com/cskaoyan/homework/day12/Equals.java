package com.cskaoyan.homework.day12;

public class Equals {
    public static void main(String[] args) {
        Animal a1 = new Animal(2,"Tom",1000);
        Dog a2 = new Dog(2,"Tom",1000);
        Animal a3 = new Animal(1,"Tom",1000);
        Animal a4 = new Animal(2,"Tom",2000);
        Animal a5 = new Animal(2,"Jack",1000);
        Animal a6 = new Animal(2,"Tom",1000);
        Animal1 a7 = new Animal1(2,"八戒",1000);
        Pig a8 = new Pig(2,"八戒",1000);
        // a1 = a1
        System.out.print("a1 == a1 :");
        System.out.println(a1.equals(a1)+"\n");
        // age
        System.out.print("判断age:");
        System.out.println(a1.equals(a3)+"\n");
        //price
        System.out.print("判断price:");
        System.out.println(a1.equals(a4)+"\n");
        //name
        System.out.print("判断name:");
        System.out.println(a1.equals(a5)+"\n");
        // 全部通过
        System.out.print("判断全部通过:");
        System.out.println(a1.equals(a6)+"\n");
        // instanceof
        System.out.print("用instanceof判断类相同或者子类:");
        System.out.print(a1.equals(a2)+"\n");
        // getClass()
        System.out.print("用getClass()判断类相同");
        System.out.println(a7.equals(a8));
    }

}

class Animal {
    int age;
    String name;
    double price;

    public Animal(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        if (age != animal.age) {
            return false;
        }
        if (Double.compare(animal.price, price) != 0) {
            return false;
        }
        return name.equals(animal.name);
    }

}

class Dog extends Animal {

    public Dog(int age, String name, double price) {
        super(age, name, price);
    }

}

class Animal1 {
    int age;
    String name;
    double price;

    public Animal1(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        if (age != animal.age) {
            return false;
        }
        if (Double.compare(animal.price, price) != 0) {
            return false;
        }
        return name.equals(animal.name);
    }

}

class Pig extends Animal1 {

    public Pig(int age, String name, double price) {
        super(age, name, price);
    }

}