package com.java.baseinfo.knowledge.code.generic;

import java.util.Set;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
// -------------------------------------------------------

public class NoOriginType {

    //原生态类型
    private static int numElementInCommonOrigin(Set s1, Set s2) {
        int result = 0;

        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }

    //通配符
    private static int numElementInCommonGeneric(Set<?> s1,Set<?>s2){
        int result = 0;

        for(Object o1:s1){
            if(s2.contains(o1)){
                result++;
            }
        }
        return result;
    }
}