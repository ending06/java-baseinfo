package com.java.baseinfo.knowledge.code.enumsautowired.enums.enumsmap;

import java.util.EnumMap;
import java.util.Map;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/15<p>
// -------------------------------------------------------

public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), // 融化
        FREEZE(LIQUID, SOLID), // 冻结
        BOIL(LIQUID, GAS), // 沸腾
        CONDENES(GAS, LIQUID), // 压缩
        SUBLIME(SOLID, GAS), // 升华
        DEPOSIT(GAS, SOLID);// 沉淀

        private final Phase src;

        private final Phase dst;

        Transition(Phase src, Phase dst) {
            this.src = src;
            this.dst = dst;
        }

        private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<Phase, Map<Phase, Transition>>(
                Phase.class);

        static {
            for (Phase p : Phase.values()) {
                m.put(p, new EnumMap<Phase, Transition>(Phase.class));
            }
            for (Transition trans : Transition.values()) {
                m.get(trans.src).put(trans.dst, trans);
            }
        }

        public static Transition from(Phase src, Phase dst) {
            return m.get(src).get(dst);
        }
    }

    public static void main(String[] args) {
        Transition transition = Phase.Transition.from(Phase.SOLID, Phase.GAS);
        System.out.printf("===>" + transition);
    }
}