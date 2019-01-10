package com.java.baseinfo.knowledge.code.classes.interfaces;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/10<p>
// -------------------------------------------------------

import java.util.AbstractList;
import java.util.List;

public class SingerImpl implements Singer, SongWriter {
    @Override
    public void sing(String songName) {

    }

    @Override
    public void songWriter(String songWriter) {

    }


    static List<Integer> intArrayList(final int[] a){
        if(a==null){
            throw new NullPointerException();
        }
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}