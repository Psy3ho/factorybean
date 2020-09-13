package com.factorybean.factorybean.structural.bridge;

public abstract class Car {
    protected Color color;

    public Car(Color color){
        this.color = color;
    }

    abstract public String paint();
}
