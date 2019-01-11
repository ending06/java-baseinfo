package com.java.baseinfo.knowledge.code.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/11<p>
// -------------------------------------------------------

public class StackGeneric<E> {

    private E[] elements;

    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackGeneric() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    private boolean isEmpty() {
        return size==0;
    }

    public static void main(String[] args) {
        StackGeneric<String> stack = new StackGeneric<String>();
        for (String arg:args){
            stack.push(arg);
        }
        while(!stack.isEmpty()){
            System.out.printf(stack.pop().toLowerCase()+";");
        }
    }
}