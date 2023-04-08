package com.scaler.designpatterns.strategy.before;

public class GoogleMaps {

    public void findPath(String from, String to, Mode mode) {
        if (mode.equals(Mode.CAR)) {
            System.out.println("Finding path for car");
            //
            //
            //
            //
            //
        } else if (mode.equals(Mode.WALK)) {
            System.out.println("Finding path for walk");
            //
            //
            //
            //
            //
        } else if (mode.equals(Mode.BIKE)) {
            System.out.println("Finding path for bike");
            //
            //
            //
            //
            //
        } else if (mode.equals(Mode.PUBLIC)) {
            System.out.println("Finding path for public");
            //
            //
            //
            //
            //
        }
    }
}
