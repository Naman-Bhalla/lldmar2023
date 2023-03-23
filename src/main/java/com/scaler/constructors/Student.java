package com.scaler.constructors;

public class Student {

    private int age;
    private String name;
    private String gender;

    public Student() {
        System.out.println("I AM AN EMPTY CONSTRUCTOR");
    }

    Student(String name, int age) {
        System.out.println("Creating a new Student " + this.age);
        this.name = name;
        this.age = age;
    }
}
