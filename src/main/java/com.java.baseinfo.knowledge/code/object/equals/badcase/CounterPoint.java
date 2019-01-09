package com.java.baseinfo.knowledge.code.object.equals.badcase;

import com.java.baseinfo.knowledge.code.object.equals.Point;

import java.util.concurrent.atomic.AtomicInteger;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

public class CounterPoint extends Point {

    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public int numberCreated() {
        return counter.get();
    }
}