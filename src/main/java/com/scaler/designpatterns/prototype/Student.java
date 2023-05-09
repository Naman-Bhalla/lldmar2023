package com.scaler.designpatterns.prototype;

public class Student implements Prototype<Student>{
    private int age;
    private double psp;
    private String email;
    private String name;

    private String batch;
    private double avgBatchPsp; //Write a query for this


    public Student(){}

    public Student(Student originalStudent) {
        this.name = originalStudent.name;
        this.age = originalStudent.age;
        this.psp = originalStudent.psp;
        this.email = originalStudent.email;
        this.batch = originalStudent.batch;
        this.avgBatchPsp = originalStudent.avgBatchPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
}
