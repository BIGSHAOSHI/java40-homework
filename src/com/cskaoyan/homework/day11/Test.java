package com.cskaoyan.homework.day11;

public class Test{
    public static void main(String[] args){
        System.out.println("=================");
        //(1)创建并初始化Bean1类对象bean1
        Test test = new Test();
        Test.Bean1 bean1 =test.new Bean1();
        System.out.println("bean1.i开始为:"+bean1.i);
        bean1.i++;
        System.out.println("bean1.i++后为:"+bean1.i);
        System.out.println("=================");
        //(2)创建并初始化Bean2类对象bean2
        Bean2 bean2 = new Bean2();
        System.out.println("bean2.j开始为:"+bean2.j);
        bean2.j++;
        System.out.println("bean2.j++后为:"+bean2.j);
        System.out.println("=================");
        //(3)创建并初始化Bean3类对象bean3
        Bean.Bean3 bean3 = new Bean().new Bean3();
        System.out.println("bean3.k开始为:"+bean3.k);
        bean3.k++;
        System.out.println("bean3.k++后为:"+bean3.k);
    }
    class Bean1{
        public int i = 0;
    }
    static class Bean2{
        public int j = 0;
    }
}

class Bean{
    class Bean3{
        public int k = 0;
    }
}