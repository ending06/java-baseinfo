package com.java.baseinfo.knowledge.code.object.hashcode;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {

    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "areacode");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private void rangeCheck(int param, int max, String paramName) {
        if (param < 0 || param > max) {
            throw new IllegalArgumentException(paramName + ";" + param);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        PhoneNumber that = (PhoneNumber) o;

        if (areaCode != that.areaCode)
            return false;
        if (prefix != that.prefix)
            return false;
        return lineNumber == that.lineNumber;
    }

    @Override
    public int hashCode() {
        int result = (int) areaCode;
        result = 31 * result + (int) prefix;
        result = 31 * result + (int) lineNumber;
        return result;
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> phoneInfoMap = new HashMap<>();

        phoneInfoMap.put(new PhoneNumber(010, 123, 679), "testOwner");

        // 未实现hashCode方法
        System.out.printf("===>" + phoneInfoMap.get(new PhoneNumber(010, 123, 679)));
    }
}