package com.java.baseinfo.knowledge.code.generic.genericinterface;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
// -------------------------------------------------------

public class GenericFunction {

    private static Function<Object> IDENTITY_FUNCTION = new Function<Object>() {
        @Override
        public Object apply(Object args) {
            return args;
        }
    };

    public static <T> Function<T> identityFunction() {
        return (Function<T>) IDENTITY_FUNCTION;
    }

    public static void main(String[] args) {
        String[] stringsTest = { "AA", "BB", "CC" };

        Function<String> sameString = identityFunction();

        for (String temp : stringsTest) {
            System.out.println(sameString.apply(temp));
        }

        Number[] numbers = {1,2.0,3L};
        Function<Number> numbersApply = identityFunction();
        for(Number number:numbers){
            System.out.println(numbersApply.apply(number));
        }
    }
}