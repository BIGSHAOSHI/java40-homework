package com.cskaoyan.homework.day05;

/**
 * since 2022/3/25 20:04
 * authored by BIGSHAOSHI
 ***/

public class Demo {

    public static void main(String[] args) {
        Item item1 = new Item("Samsung Galaxy S21", 8000, "手机");
        Item item2 = new Item("海尔冰箱", 3000, "家具");
        Item item3 = new Item("海飞丝洗发水", 30, "日用品");
        item1.sale(10000);
        item2.sale(2000);
        item3.sale(100);
    }
}

class Item {

    String name;
    double price;
    String category;

    public Item() {
    }

    public Item(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double sale(double money) {
        if (money >= this.price) {
            System.out.print(this.name+"物品被卖出. ");
            System.out.println("找零："+(money-this.price));
            return money - this.price;
        } else
            System.out.println("金钱不足，购买失败. ");
            return -1;
    }
}

