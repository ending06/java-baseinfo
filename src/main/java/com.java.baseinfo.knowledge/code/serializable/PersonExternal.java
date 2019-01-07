package com.java.baseinfo.knowledge.code.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/7<p>
// -------------------------------------------------------

public class PersonExternal implements Externalizable {

    private int age;

    private String name;

    private String sex;

    public PersonExternal(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public PersonExternal() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeObject(name);
        out.writeObject(sex);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.readInt();
        name = (String) in.readObject();
        sex = (String) in.readObject();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonExternal{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}