package com.java.baseinfo.knowledge.code.object.comparable;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/9<p>
// -------------------------------------------------------

import java.util.Arrays;

public class Student implements Comparable<Student> {

    private String name;

    private int socre;

    @Override
    public int compareTo(Student o) {

        //从大到小
        int sub = this.socre - o.getSocre();
        if(sub<0){
            return 1;
        }else if(sub==0){
            return 0;
        }else{
            return -1;
        }
    }

    public Student(String name, int socre) {
        this.name = name;
        this.socre = socre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocre() {
        return socre;
    }

    public void setSocre(int socre) {
        this.socre = socre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", socre=").append(socre);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Student[] students = new Student[] { new Student("a", 10), new Student("b", 20) };

        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.printf(students[i] + ";");
        }
    }
}