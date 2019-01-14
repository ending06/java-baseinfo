package com.java.baseinfo.knowledge.code.enumsautowired.enums;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/14<p>
// -------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public enum Operation {
    PLUS("+") {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);

    private static final Map<String, Operation> stringToEnum = new HashMap<>();

    static {
        for (Operation operation : Operation.values()) {
            stringToEnum.put(operation.toString(), operation);
        }
    }

    public static Operation fromString(String symbol){
        return stringToEnum.get(symbol);
    }

    public static void main(String[] args) {
        double x = Double.valueOf("0.01");
        double y = Double.valueOf("0.02");

        System.out.printf("==>" + Operation.DIVIDE.apply(x, y));
    }
}