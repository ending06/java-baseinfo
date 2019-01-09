package com.java.baseinfo.knowledge.code.object.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

public class StudentComparator {

    private String name;

    private int age;

    public StudentComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentComparator{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        StudentComparator[] studentComparators = new StudentComparator[] { new StudentComparator("a", 10),
                new StudentComparator("b", 20) };

        Collections.sort(Arrays.asList(studentComparators), new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                return o2.getAge()-o1.getAge();
            }
        });

        for(int i=0;i<studentComparators.length;i++){
            System.out.printf(studentComparators[i]+";");
        }
    }
}