package com.java.baseinfo.knowledge.code.classes.strategyinterface;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
// -------------------------------------------------------


// 弊端：这个类所有实例在功能上是相互等价的
class StringLengthComparatorBadCase {

    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}


//弊端：客户端无法传递其他的比较策略
class StringLengthComparatorBadCaseOpt1 {

    private StringLengthComparatorBadCaseOpt1() {
    }

    private static final StringLengthComparatorBadCaseOpt1 INSTANCE = new StringLengthComparatorBadCaseOpt1();

    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}