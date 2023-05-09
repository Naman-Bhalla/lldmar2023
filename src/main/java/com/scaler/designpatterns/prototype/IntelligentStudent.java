package com.scaler.designpatterns.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    //Note: Always make sure that child classes override the clone method.
    //Else client might get object with partial data

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent originalIntelligentStudent){
        super(originalIntelligentStudent);
        this.iq = originalIntelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
