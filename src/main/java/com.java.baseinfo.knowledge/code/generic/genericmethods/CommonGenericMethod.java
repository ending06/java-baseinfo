package com.java.baseinfo.knowledge.code.generic.genericmethods;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/14<p>
//-------------------------------------------------------

import java.util.List;

public class CommonGenericMethod {

    private <E> E reduce(List<E> list, Function<E> f, E initVal){
       return null;
    }

    private <E> E reduce1(List<? extends E> list,Function<E> function,E initVal){
        return null;
    }

/*    public static void swap(List<?>list ,int i, int j){
        swapHelper(list, i,j);
    }*/

    class Function<E>{

    }
}