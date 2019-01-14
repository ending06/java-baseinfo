package com.java.baseinfo.knowledge.code.enumsautowired.enums;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/14<p>
//-------------------------------------------------------

public enum Operation {
    PLUS("+"){
        @Override
        double apply(double x,double y){
            return x+y;
        }
    },
    MINUS("-"){
        @Override
        double apply(double x,double y){
            return x-y;
        }
    },
    TIMES("*"){
        @Override
        double apply(double x,double y){
            return x*y;
        }
    },
    DIVIDE("/"){
        @Override
        double apply(double x,double y){
            return x/y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Operation{");
        sb.append("symbol='").append(symbol).append('\'');
        sb.append('}');
        return sb.toString();
    }

    abstract double apply(double x,double y);


    public static void main(String[] args) {
        double x = Double.valueOf("0.01");
        double y = Double.valueOf("0.02");

        System.out.printf("==>"+Operation.DIVIDE.apply(x,y));
    }
}