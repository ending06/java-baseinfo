package com.java.baseinfo.knowledge.code.object.equals.badcase;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

public class PointBadCase {

    private final int x;

    private final int y;

    public PointBadCase(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PointBadCase)) {
            return false;
        }

        PointBadCase p = (PointBadCase) o;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}