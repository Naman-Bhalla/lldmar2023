package com.scaler.introtooop;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vikas";
        s1.psp = 81;

        Student s2 = new Student();
        s2.name = "Gayathree";
        s2.psp = 74;

        s1.psp = 61;
        s1.psp = 147;

        System.out.println(s2.psp);

        s2.login();
        s1.login();
    }
}
