package com.java.baseinfo.knowledge.code.commondesign.classlibrary;

import java.util.Random;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/17<p>
// -------------------------------------------------------

public class RandomExample {
    private static final Random rnd = new Random();

    /**
     * bad methods,this method may be repeat
     * */
    public static int random(int n) {
        return Math.abs(rnd.nextInt() % n);
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);

        int low = 0;

        for (int i = 0; i < 1000000; i++) {
            if (random(n) < n / 2) {
                low++;
            }
        }

        //==>666097
        System.out.printf("==>" + low);
    }
}