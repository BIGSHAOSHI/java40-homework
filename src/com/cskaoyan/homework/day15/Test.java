package com.cskaoyan.homework.day15;

/*
编写一个Cat类
成员变量：
int age，
String name，
double price
按以下要求进行自然排序：
1，直接实现Comparable接口，按照年龄的从小到大对Cat数组进行自然排序
2，利用Comparator接口，用 匿名内部类和lambda分别对Cat数组进行自然排序

1，按照price的大到小排序
2，name的长短排序，name越长对象越大
3，综合age，name，price进行排序，要求用lambda表达式指向一个方法。
    排序的规则是age越小对象越小，age相同比较name长短，name越短对象越小，name长度也相等，比较price，price越大对象越小
 */

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        Cat c2 = new Cat(3, "Tom", 999);
        Cat c1 = new Cat(4, "Tom1", 99);
        Cat c4 = new Cat(4, "Tom12", 99999);
        Cat c5 = new Cat(6, "Tom123", 9999);
        Cat c3 = new Cat(6, "Tom123", 999999);
        Cat[] cats = {c1, c2, c3, c4, c5};
        System.out.println("开始排序前：");
        System.out.println(Arrays.toString(cats));
        //1，直接实现Comparable接口，按照年龄的从小到大对Cat数组进行自然排序
        Arrays.sort(cats);

        //
        Arrays.sort(cats,new MyCom());

        //2，利用Comparator接口，用 匿名内部类和lambda分别对Cat数组进行自然排序
        System.out.println("利用Comparator接口,用匿名内部类排序：");
        Arrays.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(Arrays.toString(cats));

        System.out.println("利用Comparator接口,用Lambda表达式排序：");
        Arrays.sort(cats, (o1, o2) -> o1.age - o2.age);
        System.out.println(Arrays.toString(cats));

        //3，按照price的大到小排序
        System.out.println("按照价格排序：");
        Arrays.sort(cats, (o1, o2) -> (int) (o1.price - o2.price));
        System.out.println(Arrays.toString(cats));

        //2，name的长短排序，name越长对象越大
        System.out.println("按照Name长短排序：");
        Arrays.sort(cats, (o1, o2) -> o1.name.length() - o2.name.length());
        System.out.println(Arrays.toString(cats));

        //3，综合age，name，price进行排序，要求用lambda表达式指向一个方法。
        System.out.println("综合排序：");
        Arrays.sort(cats, (o1, o2) -> {
            if (o1.age == o2.age && o1.name.length() == o2.name.length()) {
                return (int) (o1.price - o2.price);
            } else if (o1.age == o2.age) {
                return o1.name.length() - o2.name.length();
            } else {
                return o1.age - o2.age;
            }
        });
        System.out.println(Arrays.toString(cats));
    }
}

class Cat implements Comparable<Cat> {
    int age;
    String name;
    double price;

    public Cat() {
    }

    public Cat(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }
}

class MyCom implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}
