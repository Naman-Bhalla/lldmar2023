package com.scaler.accessmodifiers;

public class Student {

    private String name; // am: name
    int age; // am: default
    protected String gender; // am: protected
    public String batch; //am: public


    private void do1() {
        System.out.println("Doing 1");
    }

    void do2() {
        System.out.println("Doing 2");
    }

    protected void do3() {
        System.out.println("Doing 3");
    }

    public void do4() {
        System.out.println("Doing 4");
    }
}
