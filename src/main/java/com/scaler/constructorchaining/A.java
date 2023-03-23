package com.scaler.constructorchaining;

public class A {
    private int i = 1;
    A() {
        System.out.println("Contructor of A");
    }

    public void printI() {
//        if (user.isAuthorized()) {
            System.out.println(i);
//        }

    }

    public void setI(int i) {
        this.i = i;
    }
}
