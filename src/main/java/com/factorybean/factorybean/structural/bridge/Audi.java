package com.factorybean.factorybean.structural.bridge;

public class Audi extends Car{

    public Audi(Color color) {
        super(color);
    }

    @Override
    public String paint() {
        return "Audi is " + color.fill();
    }
}
