package com.java.baseinfo.knowledge.code.object.cloneable;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

public class HashTable implements Cloneable {

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

        // recursively copy the linked list headed by this entry
        Entry deepCopy() {
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }
    }

    @Override
    public HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();

            // 如果链很长，有溢出风险
            result.buckets = new Entry[buckets.length];

            for (int i = 0; i < buckets.length; i++) {
                result.buckets[i] = buckets[i].deepCopy();
            }
            return result;
        } catch (CloneNotSupportedException e) {
            System.out.printf("CloneNotSupportedException.exception===>" + e);
            return null;
        }
    }
}