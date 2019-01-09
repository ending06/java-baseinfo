package com.java.baseinfo.knowledge.code.object.equals.badcase;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

import com.java.baseinfo.knowledge.code.object.equals.Color;

public class ColorPointBadCaseBadCase extends PointBadCase {

    private final Color color;

    public ColorPointBadCaseBadCase(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointBadCaseBadCase)) {
            return false;
        }
        // 如下代码不合理
        return super.equals(o) && ((ColorPointBadCaseBadCase) o).color == color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        PointBadCase p = new PointBadCase(1, 2);

        ColorPointBadCaseBadCase colorPoint = new ColorPointBadCaseBadCase(1, 2, Color.GREEN);

        /**
         * <p>
         * p.equals colorpoint===>true</>
         * <p>
         * colorpoint.equals p===>false</>
         * */
        System.out.println("p.equals colorpoint===>" + p.equals(colorPoint));
        System.out.println("colorpoint.equals p===>" + colorPoint.equals(p));
    }
}