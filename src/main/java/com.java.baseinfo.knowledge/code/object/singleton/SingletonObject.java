package com.java.baseinfo.knowledge.code.object.singleton;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/8<p>
// -------------------------------------------------------

import java.io.Serializable;

public class SingletonObject implements Serializable {

    private static final long serialVersionUID = 8175472021252935624L;

    private static final SingletonObject INSTANCE = new SingletonObject();

    private SingletonObject() {
    }

    /**
     * 均会返回同一个对象的引用，不会创建其他Singleton的实例
     * */
    public static SingletonObject getInstance() {
        return INSTANCE;
    }

    /**
     * 保证每次反序列化的时候，均返回同一个实例
     * */
    private Object readResolve() {
        return INSTANCE;
    }
}