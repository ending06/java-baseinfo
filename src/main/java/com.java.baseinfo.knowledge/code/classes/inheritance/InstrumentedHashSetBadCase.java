package com.java.baseinfo.knowledge.code.classes.inheritance;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/10<p>
// -------------------------------------------------------

public class InstrumentedHashSetBadCase<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSetBadCase() {
    }

    public InstrumentedHashSetBadCase(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {

        //+1
        addCount += collection.size();

        //super +1
        return super.addAll(collection);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSetBadCase<String> s = new InstrumentedHashSetBadCase<>();
        s.addAll(Arrays.asList("snap", "temp", "pop"));

        // real addCount is 6
        System.out.printf("we expect addCount is 3,so th real addCount=" + s.getAddCount());
    }
}