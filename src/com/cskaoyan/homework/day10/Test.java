package com.cskaoyan.homework.day10;

// 最后，在测试类中，编写测试代码，要求进行如下测试：
public class Test {
    public static void main(String[] args) {

        Person p;
        p = new NorthPerson();
        p.eat();
        p = new SouthPerson();
        p.eat();

        System.out.println("\n测试一:");
        test1(new NorthPerson());
        test1(new SouthPerson());

        System.out.println("\n测试二:");
        test2();

        System.out.println("\n测试三:");
        test3();
        
    }

    // 1，编写测试方法，要求该方法允许传入SouthPerson对象和NorthPerson对象，
    // 并在方法体中调用它们的eat()方法。
    // 方法调用的结果一致吗？
    public static void test1(Person p) {
        p.eat();
    }

    // 2，用父类引用指向子类对象的方式创建SouthPerson对象，
    // 能否直接访问salary属性和swim()方法？
    // 如果不能，应该怎么写代码让它能够正常调用？
    public static void test2() {
        Person p = new SouthPerson();
        // System.out.println(p.salary);
        // p.swim();
        SouthPerson sp = (SouthPerson) p;
        System.out.println(sp.salary);
        sp.swim();
    }

    // 3，用父类引用指向子类对象的方式创建NorthPerson对象，
    // 能否（直接或写代码）访问salary属性和swim()方法？
    // 如果不能，将该对象引用强转为SouthPerson引用，能否成功？为什么？
    public static void test3() {
        Person p = new NorthPerson();
        // System.out.println(p.salary);
        // p.swim();
        NorthPerson np = (NorthPerson) p;
        // System.out.println(np.salary);
        // np.swim();
        System.out.println("np的height为："+np.height);
        np.drink();
    }

}

/*
 * 父类Person
 * 属性：String name，int age
 * 行为：eat();
 */
class Person {
    String name;
    int age;

    public void eat() {
        System.out.println(name + "在吃饭");
    }
}

/*
 * 子类SouthPerson
 * 属性：String name，int age，double salary
 * 行为：eat()，swim()
 */

class SouthPerson extends Person {
    double salary;

    @Override
    public void eat() {
        System.out.println("南方人喜欢吃米饭");
    }

    public void swim() {
        System.out.println("南方人在游泳！");
    }
}

/*
 * 子类NorthPerson
 * 属性：String name，int age，double height
 * 行为：eat()，drink()
 */
class NorthPerson extends Person {
    double height;

    @Override
    public void eat() {
        System.out.println("北方人喜欢吃面食");
    }

    public void drink() {
        System.out.println("北方人在喝酒！");
    }
}