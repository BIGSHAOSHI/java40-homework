package com.cskaoyan.homework.day09;


/*final修饰成员/静态成员变量，表示一个常量，必须明确地赋值。
自定义一个类，类中定义三个成员变量a，b，c，用final修饰这三个成员变量
再定义两个静态成员变量staticA和staticB，也用final修饰这两个静态成员变量然后
        1，请用三种不同的方式，分别为成员变量a，b，c赋值
        2，请用两种不同的方式，分别为静态成员变量staticA和staticB赋值*/


public class FinalTest {
    public static void main(String[] args) {
        System.out.println("final修饰的成员变量a,b,c的三种赋值：");
        new TestABC1().print();
        new TestABC2().print();
        new TestABC3(1, 2, 3).print();

        System.out.println("\nfinal修饰的静态成员变量staticA,staticB的两种赋值：");
        new TestStaticAB1().print();
        new TestStaticAB2().print();
    }
}

class TestStaticAB1 {
    static final String staticA = "BroA";
    static final String staticB = "BroB";

    public void print() {
        System.out.println("第一种显式赋值：" + "staticA:" + staticA + " staticB:" + staticB);
    }
}

class TestStaticAB2 {
    static final String staticA;
    static final String staticB;

    static {
        staticA = "BroA";
        staticB = "BroA";
    }

    public void print() {
        System.out.println("第二种静态代码块赋值：" + "staticA:" + staticA + " staticB:" + staticB);
    }
}

class TestABC1 {
    final int a = 1;
    final int b = 1;
    final int c = 1;

    public TestABC1() {
    }

    public void print() {
        System.out.print("第一种显式赋值：");
        System.out.print(" a:" + a);
        System.out.print(" b:" + b);
        System.out.println(" c:" + c);
    }
}

class TestABC2 {
    final int a;
    final int b;
    final int c;

    {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public TestABC2() {
    }

    public void print() {
        System.out.print("第二种构造代码块赋值：");
        System.out.print("a:" + a);
        System.out.print(" b:" + b);
        System.out.println(" c:" + c);
    }
}

class TestABC3 {
    final int a;
    final int b;
    final int c;

    public TestABC3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print() {
        System.out.print("第三种构造器赋值：");
        System.out.print(" a:" + a);
        System.out.print(" b:" + b);
        System.out.println(" c:" + c);
    }
}