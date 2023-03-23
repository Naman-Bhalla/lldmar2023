package com.scaler.introtooop;

public class Student {
    String name;
    int age;
    double psp;
    String batch;

    void login() {
        System.out.println(name + " has logged in");
    }

    void increasePsp(int newpsp) {
        psp = newpsp;
    }


}
