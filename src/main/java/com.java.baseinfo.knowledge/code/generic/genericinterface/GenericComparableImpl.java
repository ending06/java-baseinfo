package com.java.baseinfo.knowledge.code.generic.genericinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
// -------------------------------------------------------

public class GenericComparableImpl {

    public static <T extends Comparable<T>> T max(List<T> list) {

        Iterator<T> iterator = list.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T temp = iterator.next();
            if (temp.compareTo(result) > 0) {
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,12,6,20);
        System.out.printf("==>"+max(list));
    }
}