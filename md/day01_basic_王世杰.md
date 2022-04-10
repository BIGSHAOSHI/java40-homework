# Day01-HomeWork

## Written by 王世杰

## 1.简答题

### 1.1 对于下列代码，请判断输出的结果是什么。

   ``` java
   int i = 1;
   boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
   System.out.println(b);
   System.out.println(i);
   ```

   ```Terminal
   false
   3
   ```

### 1.2 一个16位无符号二进制数的表示的范围是什么？有符号数呢？它们分别对应Java中什么数据类型？

   ```java
   0    ~ 2^16-1  char
   2^15 ~ 2^15-1  short
   ```

   

### 1.3 标识符相关问题：

   1. 从语法上来说，标识符的命名中什么不能作为开头？
   2. 从语法上来说，可以用中文给标识符命名吗？
   3. <span style=color:red;background:yellow>**按照标识符的约定规范中，应该怎么写标识符命名规范？试着从包名，类名，变量名，方法名等角度具体说明。（重点！！！）**</span>

   ```java
   1.除了以下几种以外的：
    * 字母（A~Z 和 a~z）
    * 下划线（_）
    * 美元符号（$）
    * Unicode 字符集中编号为0xC0以及它后面的所有符号
   2.可以
   3.包名：·包名应该全部小写,包名不存在大写,即便是专有名词也要小写china
           ·注意一级包名应该最好只有一个单词,
           ·若这个单词如果是名词,最好用单数形式,不要用复数形式.
     类名：·使用大驼峰式的命名规范,应该使用合法的英文单词,不要使用拼音,更不要中英混合当然特殊情况除外,比如beijing,alibaba,baidu等等
           ·类名要起的有含义,有意义,看到这个类名,可以大概知道这个类有啥用
     变量名：·小驼峰式命名,应该使用合法的英文单词,不要使用拼音,更不要中英混合
            ·变量名要起的有含义,有意义,看到这个变量名,可以大概知道这个变量有啥用
            ·实际开发中,千万不要命名变量为a,b,c,d等等
     方法名：·小驼峰式的命名规范
   ```

   

### 1.4 Java数据类型相关问题：

   1. 什么是数据类型？（定义）
   2. Java的数据类型分为几类？具体有哪些？（十分基础的问题）
   3. 基本数据类型的数值类型取值范围分别是什么？（该题不要求详细写出答案，请你自己总结和记忆一下。）

   ```java
   1.数据类型，表示的是一组数据的集合，和基于该数据集合的一组合法操作。
   2.一种是基本数据类型
   			a.整形     byte short int long
   			b.浮点型   float double
   			c.字符型   char
   			d.布尔型   boolean
     另一种是引用数据类型
   3.
   	a.整形     byte（-128 ~ 127） short（-3万多 ~ 3万多） int（-21亿 ~ 21亿） long（-922亿亿 ~ 922亿亿）
   	b.浮点型   float（大约  ±3.403E38（有效位数7~8位）） double（大约  ±1.798E308（有效数字16~17位））
   	c.字符型   char :16位无符号整数（进行计算的时候）
   	d.布尔型   boolean  false or true
   ```

   

### 1.5 Java数据类型转换相关问题：

   1. 大的分类上来说，Java数据类型转换有几类？分别是什么？
   2. 这两类数据类型转换，对于基本类型而言是怎么发生的？请从以下三个角度说明类型转换：
      - 数值数据类型的取值范围
      - 是否需要写额外代码
      - 有无数据失真的风险？

   ```java
   1.两种：一种是不需要加代码编译器自动进行的类型转化 另一种是通过代码强制进行类型转换
   2.
   	（1）数值数据类型的取值范围:
   		a.自动数据类型发生在"小取值范围"转换为"大取值范围"的数据类型转换之间。 但是要注意：
   			整型自然是占用内存空间越大，取值范围就越大。
   			浮点型的float虽然只占4个字节，但是它比所有整型的取值范围都大。
   			该体系中double是取值范围最大的，byte是最小的。
   			char类型比较特殊，在参与数值类型的自动类型转换时，是编码值参与了转换。而且由于char类型的编码值范围是[0，65535]，所以只有int及以上数据类型的取值范围比char类型大。
   		b.强制类型转换是从"大取值范围"的数据类型转换到"小取值范围"的数据类型
   	（2）是否需要写额外代码：
   		a.自动类型转换不需要额外代码，编译器自动进行
   		b.强制类型转换需要额外的代码
   	（3）有无数据失真的风险？
   		a.自动类型转换在某些整型在自动转换成浮点型时，会出现精度丢失数据失真的问题。
   		b.强制类型转换极易造成数据溢出导致数据失真
   ```

   

### 1.6 Java中的运算符很多，运算符的优先级也不好全部都记忆下来，实际开发中应该怎么做？

   ```java
   .val
   ```

   

### 1.7 在使用Scanner做键盘录入时，为什么不能混用next系列方法和nextLine方法？

   ```Java
   当使用同一个Scanner对象接收数值类型后又使用nextLine()方法接收字符串时，输入数值后回车，会导致程序并不会等待并接收一个字符串，而是直接结束键盘录入。究其原因在于，nextLine()方法碰到回车就结束扫描，所以该方法此时接收的实际上是一个（绝对）空字符串。
   ```



## 2.编程

### 2.1 Scanner基础使用练习

> 键盘输入某个学生的三门学科（数学，语文，英语）成绩，然后分别求出三科成绩的平均分，最低分，最高分，三科的总分。

<span style=color:red;background:yellow>**注：**</span>

1. 代码直接写在main()方法中即可，<font color=red>**注意命名规范！**</font>
2. 注意录入数据的数据类型。

```java
package com.homework.day01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double mathFraction = 0;
        double chineseFraction = 0;
        double englishFraction = 0;
        double averageFraction = 0;
        double maxFraction = 0;
        double minFraction = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数学成绩：");
        mathFraction = scanner.nextDouble();
        System.out.println("请输入语文成绩：");
        chineseFraction = scanner.nextDouble();
        System.out.println("请输入英语成绩：");
        englishFraction = scanner.nextDouble();

        averageFraction = (mathFraction + chineseFraction + englishFraction) / 3;
        maxFraction = (mathFraction > chineseFraction) ? ((mathFraction > englishFraction) ? mathFraction : englishFraction) : ((chineseFraction > englishFraction) ? chineseFraction : englishFraction);
        minFraction = (mathFraction < chineseFraction) ? ((mathFraction < englishFraction) ? mathFraction : englishFraction) : ((chineseFraction < englishFraction) ? chineseFraction : englishFraction);

        System.out.println("三科成绩平均分是："+averageFraction);
        System.out.println("三科成绩最高分是："+maxFraction);
        System.out.println("三科成绩最低分是："+minFraction);
    }
}
```

![2.1](D:\code\homework\image\day01\2.1.png)



### 2.2 Scanner基础使用练习

> 使用Scanner依次接收以下三种数据类型的值：
>
> 1. int类型
> 2. String类型
> 3. double类型
>
> 接收三个值后，再计算：
>
> 1. 求和：int + double
> 2. 拼接字符串：int + double + String
>
> 分别接收计算结果后，输出该计算结果。

<span style=color:red;background:yellow>**注：**</span>

1. **使用Scanner时，注意不要混用next系列和nextLine方法。**（原因可以查看详细文档说明）
2. 代码直接全部写在main方法中即可。

```java
package com.homework.day01;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        int integer = 0;
        String str = "";
        double dou = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个int型整数：");
        integer =  Integer.parseInt(scanner.nextLine());
        System.out.println("请输入一个字符串：");
        str = scanner.nextLine();
        System.out.println("请输入一个double型浮点数：");
        dou = Double.parseDouble(scanner.nextLine());

        double sum = integer + dou;
        String str2 = Integer.toString(integer)+Double.toString(dou)+str;

        System.out.println("(1) 求和：int + double 结果为："+sum);
        System.out.println("(1) 拼接字符串：int + double + String 结果为："+str2);
    }
}
```

![2.2](D:\code\homework\image\day01\2.2.png)



### 2.3 switch练习

> 利用switch语句输出每个月份对应的季节：
>
> 1. 12、1、2：冬季
> 2. 3、4、5：春季
> 3. 6、7、9：夏季
> 4. 9、10、11：秋季

**注：合理使用case穿越，注意命名规范**

```java
package com.homework.day01;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个月份数字：（注：输入99999退出程序！）");
        while(true){
            month = scanner.nextInt();
            if(month >= 1 && month <= 12){
                switch (month) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println(month + "是冬季");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(month + "是春季");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(month + "是夏季");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(month + "是秋季");
                        break;
                }
            }else if (month == 99999){
                System.out.println("正在退出程序！");
                break;
            }else {
                System.out.println("请重新输入正确的月份数字：");
            }
        }
    }
}
```

![2.3](D:\code\homework\image\day01\2.3.png)



### 2.4 if多分支练习

> 键盘录入某个人的工资收入，求他应该缴纳的个人所得税以及最后得到的工资。
>
> **也就是说需要求两个值：**
>
> 1. **缴纳的个税**
> 2. **到手工资**
>
> 个人所得税的计算方法是：
>
> 应纳税额 = 应纳税所得额 * 税率 - 速算扣除数 <span style=color:red;background:yellow>**（速算扣除额已经扣除了重复计算的部分）**</span>
>
> 其中，应纳税所得额 = 工资薪金所得-2000（即工资超过2000的部分才需要缴税）
>
> 针对不同的收入人群，需要缴纳个税的税率是不同的，详参下列表格：
>
> | 级数 |            应纳税所得额             | 税率（单位:%） | 速算扣除数 |
> | :--: | :---------------------------------: | :------------: | :--------: |
> |  1   |          **不超过500元的**          |       5        |     0      |
> |  2   |    **超过500元但是不超过2000的**    |       10       |     25     |
> |  3   |  **超过2000元但是不超过5000元的**   |       15       |    125     |
> |  4   |  **超过5000元但是不超过20000元的**  |       20       |    375     |
> |  5   | **超过20000元但是不超过40000元的**  |       25       |    1375    |
> |  6   | **超过40000元但是不超过60000元的**  |       30       |    3375    |
> |  7   | **超过60000元但是不超过80000元的**  |       35       |    6375    |
> |  8   | **超过80000元但是不超过100000元的** |       40       |   10375    |
> |  9   |         **超过100000元的**          |       45       |   15375    |

注：

1. 代码直接写在main()方法中即可，<font color=red>**注意命名规范！**</font>
2. <font color=red>**再次重复一遍，速算扣除数，已经扣除了重复计算的部分。你不需要考虑重复计算的部分。**</font>

```java
package com.homework.day01;

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        double sumSalary = 0;
        double salary = 0;
        double tax = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的税前月收入：（非负数！）");
            sumSalary = scanner.nextDouble();
            if (sumSalary >= 0) {
                if (sumSalary - 2000 < 500) {
                    tax = 0.05 * (sumSalary - 2000) - 0;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 >= 500) {
                    tax = 0.10 * (sumSalary - 2000) - 25;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 2000) {
                    tax = 0.15 * (sumSalary - 2000) - 125;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 5000) {
                    tax = 0.20 * (sumSalary - 2000) - 375;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 20000) {
                    tax = 0.25 * (sumSalary - 2000) - 1375;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 40000) {
                    tax = 0.30 * (sumSalary - 2000) - 3375;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 60000) {
                    tax = 0.35 * (sumSalary - 2000) - 6375;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 80000) {
                    tax = 0.40 * (sumSalary - 2000) - 10375;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                } else if (sumSalary - 2000 > 100000) {
                    tax = 0.45 * (sumSalary - 2000) - 15375;
                    salary = sumSalary - tax;
                    System.out.println("缴纳的个税为：" + tax);
                    System.out.println("到手工资为：" + salary);
                }
            } else {
                System.out.println("请重新输入合法的值：");
            }
        }
    }
}
```

![2.4](D:\code\homework\image\day01\2.4.jpg)



### 2.5 循环相关练习题

> 无论是for循环、while循环还是do...while循环，它们的本质都是一致的，使用时也没有特别的差异。下列给出几道简单的练习题，大致做一做。实际开发中，要根据实际需求，灵活使用循环。
>
> 1. 计算 2 + 4 + 6 + … + 100 的值。
> 2. 计算2000年1月1日到2008年1月1日相距多少天。（注意闰年）
> 3. 循环输入一个不为0的数进行累加，直到输入的数字为0，结束循环并最后输出累加的结果。

注：

1. 代码直接写在main()方法中即可，<font color=red>**注意命名规范！**</font>
2. 使用什么循环都行，实现功能就行。

```java
package com.homework.day01;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 2; i <= 100; i += 2) {
            res += i;
        }
        System.out.println("计算 2 + 4 + 6 + … + 100 的值为：" + res);
        System.out.println("======================================");

        int daySum = 0;
        for (int year = 2000; year < 2008; year++) {
            if (year % 4 == 0 || year % 100 == 0 && year % 400 != 0) {
                daySum += 366;
            }else {
                daySum += 365;
            }
        }
        System.out.println("2000年1月1日到2008年1月1日相距"+daySum+"天");
        System.out.println("=========================================");

        double inputNum = 0;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个不为0的数进行累加，直到输入的数字为0:");
        while(true){
            inputNum = scanner.nextDouble();
            if(inputNum == 0){
                System.out.println("这些输入的非零输总和为："+sum);
                break;
            }else {
                sum += inputNum;
            }
        }
    }
}
```

![2.5](D:\code\homework\image\day01\2.5.png)