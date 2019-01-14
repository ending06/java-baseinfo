package com.java.baseinfo.knowledge.code.enumsautowired.enums;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/14<p>
//-------------------------------------------------------
//--------------------- Change Logs----------------------
//  <p>@author ruirui.qu Initial Created at 2019/1/14</p>
//-------------------------------------------------------

public enum OperationBadCase {
    PLUS,MINUS,TIMES,DIVIDE;

    double apply(double x,double y){
        switch (this){
            case PLUS:return x+y;
            case MINUS:return x-y;
            case TIMES:return x*y;
            case DIVIDE:return x/y;
        }
        throw new AssertionError("unknow op:"+this);
    }
}