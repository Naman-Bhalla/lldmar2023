package com.scaler.designpatterns.strategy.after.pathcalculatorstrategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path for car");
    }
}
