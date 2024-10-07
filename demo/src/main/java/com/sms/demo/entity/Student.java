package com.sms.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {



    @Id
    private long rollno;
    @Column
    private String name;

    @Column
    private double cgpa;
    @Column
    private String branch;

    public Student(){

    }

    public Student(long id, long rollno, String name, double cgpa, String branch) {

        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
        this.branch = branch;
    }



    public long getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                " rollno=" + rollno +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", branch='" + branch + '\'' +
                '}';
    }
}
