package com.java.baseinfo.knowledge.code.methods.varargs;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/16<p>
// -------------------------------------------------------

public class VarargsMethods {

    public static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }
}