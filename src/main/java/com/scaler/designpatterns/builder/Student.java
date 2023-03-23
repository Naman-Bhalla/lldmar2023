package com.scaler.designpatterns.builder;

import javax.naming.directory.InvalidAttributesException;

public class Student {
    private int age;
    private String fName;
    private String lName;
    private String gender;
    private double psp;
    private double weight;


    private Student(Builder builder) {
        this.age = builder.getAge();
        this.fName = builder.getfName();
        this.lName = builder.getlName();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.weight = builder.getWeight();
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {

        private int age;
        private String fName;
        private String lName;
        private String gender;
        private double psp;
        private double weight;

        private boolean validate() {
            if (fName.length() + lName.length() <= 5) {
                return false;
            }
            return true;
        }

        public Student build() {
//            if(!validate()) {
//                throw new InvalidAttributesException();
//            }
            return new Student(this);
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public int getAge() {
            return age;
        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public String getGender() {
            return gender;
        }

        public double getPsp() {
            return psp;
        }

        public double getWeight() {
            return weight;
        }
    }
}
