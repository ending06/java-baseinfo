package com.java.baseinfo.knowledge.code.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
// -------------------------------------------------------
public class GenericMethodsWithWarning {

    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    /**
     * methods1,可以用methods2代替
     * */
    public Map<String, List<String>> params = new HashMap<String, List<String>>();

    /**
     * methods2
     * */
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add("s1-1");
        s1.add("s1-2");

        Set s2 = new HashSet();
        s2.add(10);
        s2.add(20);

        Set result = union(s1, s2);
        System.out.printf("===>" + result);
    }
}