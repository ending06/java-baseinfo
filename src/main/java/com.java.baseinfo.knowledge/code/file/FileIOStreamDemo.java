package com.java.baseinfo.knowledge.code.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/3<p>
// -------------------------------------------------------

public class FileIOStreamDemo {

    public static void main(String[] args) {
        String path = "src/test/resources/fieIOStream.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            StringBuilder builder = new StringBuilder();
            int read;

            while ((read = fileInputStream.read()) != -1) {
                builder.append((char) read);
            }
            fileInputStream.close();

            System.out.println("文件读取readResult==>" + builder.toString());

        } catch (FileNotFoundException e) {
            System.out.printf("FileNotFoundException===>" + e);
        } catch (IOException e) {
            System.out.printf("IOException===>" + e);
        }
    }
}