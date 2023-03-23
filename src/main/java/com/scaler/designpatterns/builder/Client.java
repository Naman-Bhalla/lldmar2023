package com.scaler.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
//        Student student = new Student(
//            12,  "Naman",
//                null,  null,
//                80.0,80.0)
//        );

//        // V1
//        Builder builder = new Builder();
//        builder.setAge(12);
//        builder.setfName("Naman");
//        builder.setPsp(80.0);
//        builder.setWeight(80.0);
//
//        Student student = new Student(builder);

        // V2

//        Student.Builder builder1 = Student.createBuilder();
//        builder1.setAge(12);
//        builder1.setfName("Naman");
//        builder1.setPsp(80.0);
//        builder1.setWeight(80.0);
//        Student student1 = builder1.build();

        // V3

        Student student2 = Student.createBuilder()
                .setAge(12)
                .setfName("Naman")
                .setPsp(80.0)
                .setWeight(80.0)
                .setAge(31)
                .build();


//
//        student2.setAge(13);

    }
}
