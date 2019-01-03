package com.java.baseinfo.knowledge.code.file;


import java.io.File;
import java.io.FileInputStream;


//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/3<p>
//-------------------------------------------------------

public class FileInPutStreamDemo {

    public static void main(String[] args) {
        File file = new File("src/test/resources/read.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            StringBuilder stringBuilder = new StringBuilder();
            int result;
            while((result=fileInputStream.read())!=-1){
                stringBuilder.append((char)result);
            }

            System.out.printf("read result====>"+stringBuilder.toString());

        } catch (Exception e) {
            System.out.printf("exception===>"+e);

        }
    }
}