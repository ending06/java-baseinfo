package com.java.baseinfo.knowledge.code.classes.inheritance.constructor;

import java.util.Date;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/10<p>
//-------------------------------------------------------

public final class SubBadCase extends SuperBadCase{

    private final Date date;

    SubBadCase() {
        date = new Date();
    }

    @Override
    public void overrideMe(){
        System.out.printf("Sub.date="+date);
    }

    public static void main(String[] args) {
        SubBadCase subBadCase = new SubBadCase();
        subBadCase.overrideMe();
    }
}