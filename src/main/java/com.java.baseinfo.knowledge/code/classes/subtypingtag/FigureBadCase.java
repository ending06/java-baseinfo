package com.java.baseinfo.knowledge.code.classes.subtypingtag;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
//-------------------------------------------------------

public class FigureBadCase {

    enum Shape{RECTANGLE,CIRCLE};

    final Shape shape;

    double length;

    double width;

    double radius;

    public FigureBadCase(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    public FigureBadCase(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() throws Exception {
        switch(shape){
            case RECTANGLE:
                return length*width;
            case CIRCLE:
                return Math.PI*(radius*radius);

            default:
                throw new Exception("not support this shape");
        }
    }

}