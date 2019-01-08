package com.java.baseinfo.knowledge.code.serializable;

import java.io.Serializable;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/4<p>
// -------------------------------------------------------

public class Person implements Serializable {

    private static final long serialVersionUID = -3534890433624150186L;
    private transient int age;

    private transient String name;

    private String sex;

    // 增加字段测试序列化
    private String addText;

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

    public String getAddText() {
        return addText;
    }

    public void setAddText(String addText) {
        this.addText = addText;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", addText='").append(addText).append('\'');
        sb.append('}');
        return sb.toString();
    }
}