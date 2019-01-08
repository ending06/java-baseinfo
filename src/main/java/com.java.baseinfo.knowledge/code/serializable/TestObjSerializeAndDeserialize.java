package com.java.baseinfo.knowledge.code.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/4<p>
// -------------------------------------------------------

public class TestObjSerializeAndDeserialize {

    public static void main(String[] args) {
        // 序列化
        SerializablePerson();
        // 反序列化
        Deserialization();
    }

    private static void SerializablePerson() {
        Person person = new Person();
        person.setAge(10);
        person.setName("测试");
        person.setSex("女");
        person.setAddText("addText");

        String path = "src/test/resources/person.txt";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);

            System.out.println("序列化成功");
            fileOutputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.printf("FileNotFoundException====>" + e);
        } catch (IOException e) {
            System.out.printf("IOException====>" + e);
        }
    }

    private static Person Deserialization() {

        try {
            FileInputStream fileInputStream = new FileInputStream(new File("src/test/resources/person.txt"));

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person = (Person) objectInputStream.readObject();

            System.out.printf("Deserialization.person===>"+person);

        } catch (FileNotFoundException e) {
            System.out.printf("FileNotFoundException====>" + e);
        } catch (IOException e) {
            System.out.printf("IOException====>" + e);
        } catch (ClassNotFoundException e) {
            System.out.printf("ClassNotFoundException====>" + e);
        }
        return null;
    }
}