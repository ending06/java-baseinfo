package com.java.baseinfo.knowledge.code.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/7<p>
// -------------------------------------------------------

public class TetsExternalizable {

    public static void main(String[] args) {
        ExternalizableEnCode();

        ExternalizableDecode();
    }

    private static void ExternalizableEnCode() {
        PersonExternal personExternal = new PersonExternal(18,"测试","女");
/*        personExternal.setName("测试");
        personExternal.setAge(18);
        personExternal.setSex("女");*/
        File file = new File("src/test/resources/personExternal.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(personExternal);
            System.out.printf("ExternalizableEnCode===>序列化完成");

        } catch (FileNotFoundException e) {
            System.out.printf("ExternalizableEnCode.FileNotFoundException===>" + e);
        } catch (IOException e) {
            System.out.printf("ExternalizableEnCode.IOException===>" + e);
        }

    }

    private static void ExternalizableDecode() {
        try {
            File file = new File("src/test/resources/personExternal.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            PersonExternal personExternal = (PersonExternal) inputStream.readObject();
            System.out.println("ExternalizableDecode.personExternal====>" + personExternal);

        } catch (FileNotFoundException e) {
            System.out.printf("ExternalizableDecode.FileNotFoundException===>" + e);
        } catch (IOException e) {
            System.out.printf("ExternalizableDecode.IOException===>" + e);
        } catch (ClassNotFoundException e) {
            System.out.printf("ExternalizableDecode.ClassNotFoundException===>" + e);
        }
    }
}