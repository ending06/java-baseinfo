package com.java.baseinfo.knowledge.code.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/3<p>
// -------------------------------------------------------

public class FileOutPutStreamDemo {

    /**
     * write
     * */
    public static void main(String[] args) {
        File file = new File("src/test/resources/read.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "write this to file";
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.printf("FileNotFoundException==>" + e);
        } catch (IOException e) {
            System.out.printf("IOException==>" + e);
        }
    }
}