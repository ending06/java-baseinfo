package com.java.baseinfo.knowledge.code.object.equals;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

public class ColorPoint {

    private Point point;

    private Color color;

    public ColorPoint(int x, int y, Color color) {
        if (color == null) {
            throw new IllegalArgumentException("color param invalid");
        }
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }

        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    public static void main(String[] args) {
        ColorPoint colorPoint = null;
        Point point = new Point(1, 2);
        // NullPointerException
        System.out.printf("===>" + colorPoint.equals(point));
    }
}