package com.scaler.constructorchaining;

public class D extends C {

    D() {
//        super("Naman", "naman@scaler.com");
        System.out.println("Contructor of D");
        this.setI(4);
    }
}
