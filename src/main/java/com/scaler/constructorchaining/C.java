package com.scaler.constructorchaining;

public class C extends B {
    int k = 4;
    C() {
        System.out.println("Default cons of C");
    }
    C(String name, String email) {
        System.out.println("Contructor of C with name: " + name + " and email: " + email);
    }
}
