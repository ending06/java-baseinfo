package com.java.baseinfo.knowledge.code.methods.overloading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/16<p>
// -------------------------------------------------------

public class CollectionClassfier {

    public static String classify(Set<?> set) {
        return "set";
    }

    public static String classify(List<?> list) {
        return "list";
    }

    public static String classify(Collection<?> collection) {
        return "collection";
    }

    /**
     * 如上采用的是重载，调用哪个方法是在编译时决定的
     * run result==>collection;collection;collection;
     * */
    public static void main(String[] args) {
        Collection<?>[] collection = { new HashSet<String>(), new ArrayList<BigInteger>(),
                new HashMap<String, String>().values() };
        for(Collection<?> co:collection){
            System.out.printf(classify(co)+";");
        }
    }
}