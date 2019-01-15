package com.java.baseinfo.knowledge.code.enumsautowired.enums;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/15<p>
// -------------------------------------------------------

public enum PayrollDayBadCase {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private static final int HOURS_PER_SHIFT = 8;

    /**
     * 若enum增加类型，则有可能忘记更新pay方法
     * */
    double pay(double hoursWorked, double payRae) {
        double basePay = hoursWorked * payRae;

        double overtimePay;

        switch (this) {
        case SATURDAY:
        case SUNDAY:
            overtimePay = hoursWorked * payRae / 2;
        default:
            overtimePay = hoursWorked <= HOURS_PER_SHIFT ? 0 : (hoursWorked - HOURS_PER_SHIFT) * payRae / 2;
            break;
        }
        return basePay + overtimePay;
    }
}