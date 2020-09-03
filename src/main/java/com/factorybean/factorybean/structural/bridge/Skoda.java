package com.factorybean.factorybean.structural.bridge;

public class Skoda extends Car {

    public Skoda(Color color) {
        super(color);
    }

    @Override
    public String paint() {
        return "Skoda is " + color.fill();
    }
}
