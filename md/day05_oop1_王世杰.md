# day05_oop1_王世杰



# 简答题

> 以下简答题，直接将答案写在题目下面即可。（都是一些概念，虽然我们学得是技术，但基本的概念还是需要记忆的）

1. 二维数组的本质是什么？内存中存在二维数组的特殊内存结构吗？

   ```java
   本质是数组，只是存储元素是一维数组。不存在。
   ```

   

2. 什么是类？什么是对象？（根据自己理解写一下即可）

   ```java
   类就是具有某些相同共性的事物总和，如植物和动物和微生物都是生物。那么生物就是一个类。
   对象是new出来的实例，存储在堆上。
   ```

   

3. 创建对象和类加载谁先谁后？某个类的类加载在程序某一次运行过程中，有几次？

   ```java
   类加载先
   类加载只有一次
   ```

   

4. 包装类有哪些？简要描述一下。

   ```java
   Boolean     ----	boolean
   Byte		----	byte
   Short		----	short
   Integer		----	int
   Long		----	long
   Float		----	float
   Double		----	double
   Character	----	char
   ```

   

   

5. 对于下述代码：

   ``` java
   public class Demo{
     public static void main(String[] args){
       Demo d = new Demo();
     }
   }
   ```

   main方法中创建Demo对象，会触发Demo类的类加载吗？

   我们把一定会触发类加载的场景，称之为类加载的时机。总结目前为止，类加载的时机。

   ```java
   会
   	1.new对象,触发该类类加载
   	2.启动某个类的main方法,触发该类类加载
   ```

   

6. **创建对象过程中，成员变量的赋值有很多手段，总结到目前为止成员变量的赋值方式。并谈一谈它们执行的先后顺序。**

   ```java
   (1) 默认初始化
   (2) 显示赋值
   (3) 构造器赋值
   ```

   



# 编程题

## 练习使用二维数组

### 题目1

> 某公司该年度，每个季度的销售额（单位：万元）如下：
> 第一季度：30,66, 48
> 第二季度：10, 33, 20
> 第三季度: 10,99,103
> 第四季度: 9,18,27
> 请使用二维数组存储数据
> 并计算：
> 1，每个季度平均销售额
> 2，年度销售总额

```java
package com.cskaoyan.homework.day05;

public class Sale {

    public static double[] sumAndAverage(double[][] saleDates){
        double[] res = new double[2];
        for (int i = 0; i < saleDates.length; i++) {
            for (int j = 0; j < saleDates[i].length; j++) {
                res[0] += saleDates[i][j];
            }
        }
        res[1] = res[0] / 4;
        return res;
    }

    public static void main(String[] args) {
        double[][] saleDates = {{30,66, 48},{10, 33, 20},{10,99,103},{9,18,27}} ;
        double[] res = sumAndAverage(saleDates);
        System.out.println("平均每个季度的销售额为："+res[1]);
        System.out.println("销售总额为："+res[0]);
    }
}
```

![2.1](/FileD/code/homework/image/day05/2.1.png)



### 题目2

> 已知有3个班级（一班，二班，三班）分别有3人，2人，5人
> 键盘录入每个班级的学生的成绩，并使用二维数组存储数据
> 然后计算：
> 每个班级的平均成绩，每个班级中的最高成绩和最低成绩，并输出。

```java
package com.cskaoyan.homework.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static double[][] getEveryClassScores() {
        double[][] everyClassScores = {new double[3],new double[2],new double[5]};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入"+(i+1)+"班的"+everyClassScores[i].length+"个成绩：");
            for (int j = 0; j < everyClassScores[i].length; j++) {
                everyClassScores[i][j] = sc.nextDouble();
            }
        }
        return everyClassScores;
    }

    public static double[] getEachAverageAndMaxAndMinScore(double[] classScores) {
        double[] eachAverageAndMaxAndMinScore = {0, classScores[0], classScores[0]};
        for (int i = 0; i < classScores.length; i++) {
            eachAverageAndMaxAndMinScore[0] += classScores[i];
            if (classScores[i] > eachAverageAndMaxAndMinScore[1]) {
                eachAverageAndMaxAndMinScore[1] = classScores[i];
            }
            if (classScores[i] < eachAverageAndMaxAndMinScore[2]) {
                eachAverageAndMaxAndMinScore[2] = classScores[i];
            }
        }
        eachAverageAndMaxAndMinScore[0] /= classScores.length;
        return eachAverageAndMaxAndMinScore;
    }

    public static void printThreeScore(double[] eachAverageAndMaxAndMinScore,int classNum){
        System.out.print(classNum+"班的平均分："+eachAverageAndMaxAndMinScore[0]+"  ");
        System.out.print("最高分："+eachAverageAndMaxAndMinScore[1]+"  ");
        System.out.println("最低分："+eachAverageAndMaxAndMinScore[2]);
    }

    public static void main(String[] args) {
        double[][] everyClassScores = getEveryClassScores();
        for (int i = 0; i < 3; i++) {
            printThreeScore(getEachAverageAndMaxAndMinScore(everyClassScores[0]),i+1);
        }
    }

}
```

![2.2](/FileD/code/homework/image/day05/2.2.png)



## 对象与类基础语法练习题

> 设计物品（Item）类
>
> 它具有以下属性：
>
> 1. 名字
> 2. 价格
> 3. 类别
>
> 它具有以下行为：
>
> 1. 售卖。该方法需要传入一个参数表示购买使用的金钱，如果金钱足够则打印**"xx物品被卖出"**的信息，并将找零作为返回值。
>
>    否则打印**"金钱不足，购买失败"**，并将"-1"作为返回值表示购买失败。
>
> 类定义完毕后，试着创建三个对象并使用**"对象名点"**完成属性赋值：
>
> 1. "手机类的Samsung Galaxy S21 8000元"
> 2. "家具类的海尔冰箱 3000元"
> 3. "日用品类的海飞丝洗发水 30元"
>
> 然后自行调用一下售卖方法，测试一下。

注：

1. 建议用一个public class作为测试类，用于创建对象，调用方法，访问属性等。
2. 具体类（比如本题中的Item）的定义，建议在public class下面定义非public class，这样比较方便快捷。
3. <font color=red>**不要将类定义在其它类的内部（内部类），在定义class时，一定要看清楚大括号！**</font>
4. <font color=red>**以上三条，（如无特别要求）适用于后续面向对象学习中的所有习题。**</font>

```java
package com.cskaoyan.homework.day05;

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
```

![2.3](/FileD/code/homework/image/day05/2.3.png)



## 构造方法和this关键字练习题

> 定义一个Teacher类：
>
> 包含4个成员变量 String name, int age, String gender, int teacherId
>
> 然后定义5个构造方法：
>
> 1. 无参构造
> 2. name单参构造方法
> 3. name和teacherId双参构造方法
> 4. name，age和gender的三参构造器
> 5. name，age，gender和teacherId的四参构造器（要求用this调用已存在的三参构造器）
>
> 最后再定义一个成员方法：
>
> print()：用于打印这个Teacher类对象的基本信息。
>
> ```java
> package com.cskaoyan.homework.day05;
> 
> public class Test {
>     public static void main(String[] args) {
>         Teacher t1 = new Teacher("张三", 18, "男", 1);
>         Teacher t2 = new Teacher("李四", 24, "女", 2);
>         t1.print();
>         t2.print();
>     }
> }
> 
> class Teacher {
> 
>     String name;
>     int age;
>     String gender;
>     int teacherId;
> 
>     public Teacher() {
>     }
> 
>     public Teacher(String name) {
>         this.name = name;
>     }
> 
>     public Teacher(String name, int teacherId) {
>         this.name = name;
>         this.teacherId = teacherId;
>     }
> 
>     public Teacher(String name, int age, String gender) {
>         this.name = name;
>         this.age = age;
>         this.gender = gender;
>     }
> 
>     public Teacher(String name, int age, String gender, int teacherId) {
>         this.name = name;
>         this.age = age;
>         this.gender = gender;
>         this.teacherId = teacherId;
>     }
> 
>     public void print(){
>         System.out.print("Name:"+this.name);
>         System.out.print("  Age:"+this.age);
>         System.out.print("  Gender:"+this.gender);
>         System.out.println("  TeacherID:"+this.teacherId);
>     }
> 
> 
>     public void setGender(String gender) {
>         this.gender = gender;
>     }
> }
> ```
>
> 
>
> 回答下列问题：
>
>
> 1. 在上面5个构造方法的基础上，再定义一个构造方法单独给gender赋值，能够做到吗？为什么？
>
>    ```java
>    不能，已经有
>        public Teacher(String name) {
>            this.name = name;
>        }
>    不能构成重载。
>    ```
>
> 
>
> 2. 定义完上述结构后，再定义一个成员方法setGender，用于给gender赋值。要求方法的形参就是String gender，这个方法如何写呢？
>
>    ```java
>        public void setGender(String gender){
>            this.gender = gender;
>        }
>    ```
>
> 
>
> 3. 定义完这个类后，创建两个Teacher对象分别为t1和t2
>
>    1. 要求t1对象的四个成员变量name, age, gender, teacherId的值分别为"张三"、18、"男"、 1
>    2. 要求t2对象的四个成员变量name, age, gender, teacherId的值分别为"李四"、25、"女"、 2
>    
>       最后分别用两个对象调用print方法，两次调用方法输出的结果相同吗？为什么？
>
>    ```java
>    显然结果不一样，结果如下图所示：
>    因为：t1和t2是两个引用对应两个不同的实例对象，他们属性的值都不一样。
>    ```
> 
> ![2.4](/FileD/code/homework/image/day05/2.4.png)

