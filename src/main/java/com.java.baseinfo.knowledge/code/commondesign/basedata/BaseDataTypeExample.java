package com.java.baseinfo.knowledge.code.commondesign.basedata;

import java.util.Comparator;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/17<p>
// -------------------------------------------------------

public class BaseDataTypeExample {

    public static void main(String[] args) {
        Comparator<Integer> nauralOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? -1 : (o1.equals(o2) ? 0 : 1);
            }
        };

        int result = nauralOrder.compare(new Integer(42),new Integer(42));
        System.out.printf("===>"+result);
    }
}