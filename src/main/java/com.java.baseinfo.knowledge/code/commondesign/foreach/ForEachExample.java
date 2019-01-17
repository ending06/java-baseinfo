package com.java.baseinfo.knowledge.code.commondesign.foreach;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/17<p>
// -------------------------------------------------------

public class ForEachExample {

    enum Face {
        ONE, TWO, THREE, FOUR, FIVE, SIX
    }
    
    /**
     * repeat ONE ONE---SIX SIX
     * */
    public void outPut() {
        Collection<Face> faces = Arrays.asList(Face.values());
        for (Iterator<Face> iterator = faces.iterator(); iterator.hasNext();) {
            for (Iterator<Face> j = faces.iterator(); j.hasNext();) {
                System.out.println(iterator.next() + " " + j.next()+";");
            }
        }
    }

    public void output2(){
        Collection<Face> faces = Arrays.asList(Face.values());
        for(Iterator<Face> iterator=faces.iterator();iterator.hasNext();){
            Face temp = iterator.next();
            for (Iterator<Face> j=faces.iterator();j.hasNext();){
                System.out.println(temp + " " + j.next()+";");
            }
        }
    }


    public static void main(String[] args) {
        ForEachExample forEachExample = new ForEachExample();
        forEachExample.outPut();
        System.out.println("output2===");
        forEachExample.output2();
    }
}