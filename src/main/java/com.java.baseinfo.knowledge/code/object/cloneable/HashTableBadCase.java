package com.java.baseinfo.knowledge.code.object.cloneable;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

public class HashTableBadCase implements Cloneable {

    private Entry[] buckets = new Entry[10];

    private static class Entry {
        final Object key;

        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public HashTableBadCase clone() {
        try {
            HashTableBadCase result = (HashTableBadCase) super.clone();

            result.buckets = buckets.clone();

            return result;
        } catch (CloneNotSupportedException e) {
            System.out.printf("clone.exception:"+e);
            return null;
        }
    }
}