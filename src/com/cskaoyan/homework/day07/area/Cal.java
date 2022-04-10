package com.cskaoyan.homework.day07.area;

public class Cal {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1,2);
        System.out.print("第一个长方形：  长："+rectangle1.getLength()+"宽： "+rectangle1.getWidth());
        System.out.println("第一个长方形面积："+rectangle1.getArea()+"周长为："+rectangle1.getPerimeter());
        
		Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(1.2);
        rectangle2.setWidth(2.4);
		System.out.print("第二个长方形：  长："+rectangle2.getLength()+"宽： "+rectangle2.getWidth());
        System.out.println("第二个长方形面积："+rectangle2.getArea()+"周长为："+rectangle2.getPerimeter());

        Square square1 = new Square(22.22);
        System.out.print("第一个正方形的边长："+square1.getSideLength());
        System.out.println("第一个正方形面积："+square1.getArea()+"周长为："+square1.getPerimeter());
       
		Square square2 = new Square();
        square2.setSideLength(11.11);
        System.out.print("第二个正方形的边长："+square2.getSideLength());
        System.out.println("第一个正方形面积："+square2.getArea()+"周长为："+square2.getPerimeter());
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public  void setWidth(double width) {
        this.width = width;
    }

    public  double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

}

class Square {
    private double sideLength;

    public Square() {
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return sideLength * 4;
    }
}