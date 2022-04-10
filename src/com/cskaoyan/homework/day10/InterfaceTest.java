package com.cskaoyan.homework.day10;

// 学生和老师都有共同的属性:name、gender、age 共同的行为：eat()sleep()
// 注：虽然行为一致，但实现会不同。
// 现在为了提升自身素质，大家都需要额外进行技能的学习：
//         学生需要增强实践动手能力，老师需要增强语言能力。
// 请定义抽象类和接口，描述以上体系。然后用以下方式进行测试：
//         1，用不同的父类指向不同的子类对象，理解方法调用时“编译时看左边”
//         2，用这些引用调用方法，理解方法调用时“运行时看右边”
public class InterfaceTest {

    public static void main(String[] args) {
        System.out.println("SchoolPerson p = new Student(\"王世杰\", \"男\", 23);");
        SchoolPerson p = new Student("王世杰", "男", 23);
        p.eat();
        p.sleep();
        Student s = (Student) p;
        s.practice();
        System.out.println();
        System.out.println("PracticeSkilll ps = new Student(\"屈正\", \"男\", 27);");
        PracticeSkilll ps = new Student("屈正", "男", 27);
        ps.practice();
        Student s2 = (Student) ps;
        s2.eat();
        s2.sleep();
        System.out.println();
        System.out.println("Object o = new Student(\"辛冉冉\",\"男\",27);");
        Object o = new Student("辛冉冉", "男", 27);
        ((Student) o).practice();
        ((SchoolPerson) o).eat();
        ((SchoolPerson) o).sleep();

    }
}

abstract class SchoolPerson {
    String name;
    String gender;
    int age;

    abstract void eat();

    abstract void sleep();

    public SchoolPerson(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}

interface PracticeSkilll {
    void practice();
}

interface LanguageSkill {
    void languageLearning();
}

class Student extends SchoolPerson implements PracticeSkilll {

    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    void eat() {
        System.out.println(name + "在吃！");
    }

    @Override
    void sleep() {
        System.out.println(name + "在睡觉！");
    }

    @Override
    public void practice() {
        System.out.println(name + "在进行增强动手实践的技能学习");
    }

}

class Teacher extends SchoolPerson implements LanguageSkill {

    public Teacher(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    void eat() {
        System.out.println(name + "在吃！");
    }

    @Override
    void sleep() {
        System.out.println(name + "在睡觉！");
    }

    @Override
    public void languageLearning() {
        System.out.println("在进行增强语言能力的技能学习");
    }

}
