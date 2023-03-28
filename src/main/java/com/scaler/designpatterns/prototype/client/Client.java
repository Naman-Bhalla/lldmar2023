package com.scaler.designpatterns.prototype.client;

import com.scaler.designpatterns.prototype.IntelligentStudent;
import com.scaler.designpatterns.prototype.Student;
import com.scaler.designpatterns.prototype.StudentRegistry;

public class Client {

    public static final String APR_22 = "APR_22";
    public static final String INTELLIGENT_APR_22 = "INTELLIGENT_APR_22";

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student roshan = registry.get(APR_22).clone();
        roshan.setAge(25);
        roshan.setEmail("abc@xyz.com");
        roshan.setName("Roshan");
        roshan.setPsp(95);
        System.out.println("DEBUG");
        roshan.clone();


        Student intelligentVikramStudent = registry.get(INTELLIGENT_APR_22).clone();
        intelligentVikramStudent.setPsp(75);
        intelligentVikramStudent.setName("Vikram");
        intelligentVikramStudent.setEmail("test@xyz.com");
//        intelligentVikramStudent.setIq(120);
    }

    private static void fillRegistry(StudentRegistry registry) {
        Student apr22 = new Student();
        apr22.setBatch("Apr 22");
        apr22.setAvgBatchPsp(89.88);

        registry.register(APR_22, apr22);

        IntelligentStudent intelligentApr22Student= new IntelligentStudent();
        intelligentApr22Student.setBatch("Apr 22");
        intelligentApr22Student.setAvgBatchPsp(89.88);

        registry.register(INTELLIGENT_APR_22, intelligentApr22Student);

    }
}
