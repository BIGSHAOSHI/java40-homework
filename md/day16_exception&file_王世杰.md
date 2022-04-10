# day16_exception&file

## 1.

> 今天上课的代码敲一遍

```java
```



## 2.

> 异常类只是描述异常的信息，但是什么时候产生异常，怎么处理异常和异常类本身没有关系 分别自定义编译时异常和运行时异常，在方法中抛出异常，main方法中调用该方法，并处理相应的异常

```java
package com.cskaoyan.homework.day16;

public class CustomExpressionTest {
    public static void main(String[] args) {
        NumberTest n = new NumberTest();
        //捕获异常
        try {
            System.out.println("商=" + n.shang(1, -3));
        } catch (DivisorNegativeException d) {
            System.out.println(d.getMessage());
            d.printStackTrace();
        } catch (Exception y) {
            y.printStackTrace();
        } finally {
            System.out.println("finally!");
        }
    }
}

class DivisorNegativeException extends Exception {
    public DivisorNegativeException(String msg) {
        super(msg);
    }
}

class NumberTest {
    public int shang(int x, int y) throws DivisorNegativeException {
        if (y < 0) {
            throw new DivisorNegativeException("您输入的是" + y + ",规定除数不能为负数!");
        }
        return x / y;
    }
}

```

![t2](/FileD/code/homework/image/day16/t2.png)

## 3.

> 递归删除目录与文件 给大家发一个app2目录,里面是多级目录与文件,使用递归的方式,将该目录里面的文件,目录全删除了.(目录为空才可以删) 注意: 不要放在C盘

```java
package com.cskaoyan.homework.day16;

import java.io.File;

public class DeleteByRecursion {

    public static void main(String[] args) {
        File dir = new File("//home//jie//Documents//app2");
        deleteByRecursion(dir);
    }

    public static void deleteByRecursion(File file){
        // 结束递归循环
        if (!file.exists())
            return;

        // 如果是目录，请进入内部并递归调用
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                // 调用递归
                deleteByRecursion(f);
            }
        }
        // 调用delete删除文件和空目录
        file.delete();
        System.out.println("Deleted file/folder: "+file.getAbsolutePath());
    }

}
```

![t3](/FileD/code/homework/image/day16/t3.png)

## 4.

> 带过滤器的listFiles方法练习 自己做一个目录，里面放些一下文件，文件夹 用带过滤器的listFiles方法进行筛选
>
> 条件一：仅留下文件夹名包括a的文件夹
>
> 条件二：仅留下.txt结尾的文本文件
>
> 条件三：仅留下以a开头的文件

```java
package com.cskaoyan.homework.day16;

import java.io.File;
import java.util.Arrays;

public class FilterFile {
    public static void main(String[] args) {
        File dir = new File("/home/jie/Documents/testFold");

        //条件一：仅留下文件夹名包括a的文件夹
        File[] files1 = dir.listFiles(pathname -> pathname.isDirectory() && pathname.getName().indexOf('a') != -1);
        System.out.println(Arrays.toString(files1));

        //条件二：仅留下.txt结尾的文本文件
        File[] files2 = dir.listFiles(pathname -> pathname.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(files2));

        //条件三：仅留下以a开头的文件
        File[] files3 = dir.listFiles(pathname -> pathname.isFile() && pathname.getName().startsWith("a"));
        System.out.println(Arrays.toString(files3));

    }
}
```



## 5.

> 尝试写stage4 文档在服务器 

```java
	/**
     * 更新表格某一行某一列，即某个单元格的具体数据
     * 更新成功返回true，否则返回false
     */
    @Override
    public boolean updateCellByStuId(String targetStuId, int targetCol, String newValue) {

        return studentDao.updateCellByStuId(targetStuId,targetCol,newValue);

    }
  /**
     * 通过id直接修改一条学生信息,相当于用一个对象替换原先的对象
     * 方法返回一个int状态值表示结果:
     * -1: 表示学号或者学生对象为空，表示系统错误
     * 0: 表示成功修改
     * 1: 表示数据完全一致,禁止修改
     * 2: 未找到该学生,修改失败
     */
    @Override
    public int updateStudentByStuId(String targetStuId, Student stu) {
        if (targetStuId == null || stu == null){
            return  -1;
        }
        Student[] stus = studentDao.getRealStudents();
        for (int i = 0; i < stus.length; i++) {
            if (targetStuId.equals(stus[i].getStuId())){
                return studentDao.updateStudentByStuId(targetStuId,stu);
            }
        }
        return 2;
    }
```

```java
/**
     * 校验用户输入name,返回一个int状态值:
     * 0: 一切正常
     * 1: name为空
     * 2: name的长度不在2-5之内
     */
    private static int checkName(String name) {
        if (name == null || name.equals("")) {
            return 1;
        }
        if (name.length() < 2 || name.length() > 5) {
            return 2;
        }
        return 0;
    }

    /**
     * 校验用户输入age,返回一个int状态值:
     * 0: 一切正常
     * 1: 输入为空
     * 2: 非数字
     * 3: 没有在1-150之间
     */
    private static int checkAge(String age) {
        if (age == null || age.equals("")) {
            return 1;
        }
        try {
            Integer.parseInt(age);
        } catch (Exception e) {
            return 2;
        }
        if (Integer.parseInt(age) < 1 || Integer.parseInt(age) > 150) {
            return 3;
        }
        return 0;
    }

    /**
     * 校验用户输入city,只需要校验非空,所以:
     * true: 表示非空,能够使用
     * false: 空,不能使用
     */
    private static boolean checkCity(String city) {
        if (city == null || city.equals("")) {
            return false;
        }
        return true;
    }

    /**
     * 校验用户输入手机号,返回一个int状态值:
     * 0: 一切正常
     * 1: 输入为空
     * 2: 格式不正确
     */
    private static int checkPhoneNum(String phoneNum) {
        if (phoneNum == null || phoneNum.equals("")) {
            return 1;
        }
        try {
            Long.parseLong(phoneNum);
        } catch (Exception e) {
            return 2;
        }
        if (Long.parseLong(phoneNum) < 10000000000L || Long.parseLong(phoneNum) >= 100000000000L) {
            return 2;
        }
        return 0;
    }

    /**
     * 校验用户输入邮箱,返回一个int状态值:
     * 0: 一切正常
     * 1: 输入为空
     * 2: 格式不正确
     */
    private static int checkEmail(String email) {
        if (email == null || email.equals("")){
            return 1;
        }
        if (!email.contains("@") || email.startsWith("@") || email.endsWith("@")){
            return 2;
        }
        return 0;
    }

    /**
     * 性别只能是两个选项: 男和女
     * 校验通过返回true,否者返回false
     */
    private static boolean checkGender(String gender) {
        return gender.equals("男") || gender.equals("女");
    }
```





## 6.

> stage5 , 文档在服务器里面

```java
// 自然排序：
public class Student implements Comparable<Student>{
        @Override
    public int compareTo(Student o) {
        return Integer.parseInt(this.getStuId()) - Integer.parseInt(o.getStuId());
    }
}
	// 按照学号升序排序：自然排序 
    @Override
    public String[][] ascendingSortById() {
        Student[] realStus = studentDao.getRealStudents();
        Arrays.sort(realStus);
        return get2DStrArrByStudentArr(realStus);
    }
	// 按照学号升序排序：比较器排序 
	@Override
    public String[][] descendingSortByAge() {
        Student[] realStus = studentDao.getRealStudents();
        Arrays.sort(realStus, (stu1, stu2) -> Integer.parseInt(stu1.getStuId()) - Integer.parseInt(stu1.getStuId()));
        return get2DStrArrByStudentArr(realStus);
    }
	
	// 按照年龄降序排序：比较器排序
	@Override
    public String[][] descendingSortByAge() {
        Student[] realStus = studentDao.getRealStudents();
        Arrays.sort(realStus, (stu1, stu2) -> Integer.parseInt(stu2.getAge()) - Integer.parseInt(stu1.getAge()));
        return get2DStrArrByStudentArr(realStus);
    }

	// 综合排序：
	@Override
    public String[][] totalSort() {
        Student[] realStus = studentDao.getRealStudents();
        int count = 0;
        for (Student stu : realStus) {
            if (stu.getGender().equals("男")) {
                count++;
            }
        }
        Student[] maleStus = new Student[count];
        Student[] femaleStus = new Student[realStus.length - count];
        int index = 0;
        for (int i = 0; i < realStus.length; i++) {
            if (realStus[i].getGender().equals("男")) {
                maleStus[index++] = realStus[i];
            }
        }
        index = 0;
        for (int i = 0; i < realStus.length; i++) {
            if (realStus[i].getGender().equals("女")) {
                femaleStus[index++] = realStus[i];
            }
        }
        Arrays.sort(maleStus, StudentControllerImpl::compareTo);
        Arrays.sort(femaleStus, StudentControllerImpl::compareTo);
        return get2DStrArrByStudentArr(maleStus,femaleStus);
    }

    private static int compareTo(Student stu1, Student stu2) {
        if (stu1.getSchool().length() == stu2.getSchool().length()) {
            return Integer.parseInt(stu1.getPhone().substring(2, 3)) - Integer.parseInt(stu2.getPhone().substring(2, 3));
        } else {
            return stu1.getSchool().length() - stu2.getSchool().length();
        }
    }
	// 方法重载：String[][] get2DStrArrByStudentArr(Student[] maleStus, Student[] femaleStus)
    private String[][] get2DStrArrByStudentArr(Student[] maleStus, Student[] femaleStus) {
        String[][] result = new String[maleStus.length + femaleStus.length][];
        for (int i = 0; i < result.length; i++) {
            if (i < maleStus.length) {
                Student aStu = maleStus[i];
                result[i] = new String[]{
                        aStu.getStuId(), aStu.getName(), aStu.getGender(), aStu.getSchool(), aStu.getMajor(), aStu.getAge(), aStu.getCity(), aStu.getPhone(), aStu.getEmail()};
            } else {
                Student aStu = femaleStus[i - maleStus.length];
                result[i] = new String[]{
                        aStu.getStuId(), aStu.getName(), aStu.getGender(), aStu.getSchool(), aStu.getMajor(), aStu.getAge(), aStu.getCity(), aStu.getPhone(), aStu.getEmail()};
            }
        }
        return result;
    }
```



