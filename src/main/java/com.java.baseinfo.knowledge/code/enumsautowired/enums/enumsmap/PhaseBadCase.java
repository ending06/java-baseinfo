package com.java.baseinfo.knowledge.code.enumsautowired.enums.enumsmap;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/15<p>
// -------------------------------------------------------

public enum PhaseBadCase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT, // 融化
        FREEZE, // 冻结
        BOIL, // 沸腾
        CONDENES, // 压缩
        SUBLIME, // 升华
        DEPOSIT;// 沉淀

        private static final Transition[][] TRANSITIONS = { { null, MELT, SUBLIME }, { FREEZE, null, BOIL },
                { DEPOSIT, CONDENES, null } };

        public static Transition from(PhaseBadCase src, PhaseBadCase dst) {
            return TRANSITIONS[src.ordinal()][dst.ordinal()];
        }
    }
}