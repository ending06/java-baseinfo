package com.java.baseinfo.knowledge.code.classes.subtypingtag;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
//-------------------------------------------------------

public abstract class Figure {

    abstract double area();

    public static void main(String[] args) {
        Figure figure = new Rectangle(2,3);
        System.out.printf("==>"+figure.area());
    }
}

class Circle extends Figure{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*(radius*radius);
    }
}

class Rectangle extends Figure{

    private final double length;

    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
       return length*width;
    }
}