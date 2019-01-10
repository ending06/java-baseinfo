package com.java.baseinfo.knowledge.code.classes.interfaces.abstractskeleton;

import java.util.Map;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/10<p>
// -------------------------------------------------------

public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

    @Override
    public abstract K getKey();

    @Override
    public abstract V getValue();

    // entries in modifiable maps must ovveride this methods

    @Override
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Map.Entry)) {
            return false;
        }

        Map.Entry<?, ?> arg = (Map.Entry) o;
        return equals(getKey(), arg.getKey()) && equals(getValue(), arg.getValue());
    }

    private boolean equals(Object o1, Object o2) {
        return o1==null?o2==null:o1.equals(o2);
    }

    @Override
    public int hashCode() {
        return hashCode(getKey()) ^ hashCode(getValue());
    }

    private int hashCode(Object o) {
        return o == null ? 0 : o.hashCode();
    }
}