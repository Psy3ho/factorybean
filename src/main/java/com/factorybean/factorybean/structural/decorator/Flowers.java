package com.factorybean.factorybean.structural.decorator;

public class Flowers extends TableDecorator {

    public Flowers(Table table) {
        super(table);
    }

    public  String decorate(){
        return super.decorate() + decorateWithFlowers();
    }

    private String decorateWithFlowers() {
        return " with flowers";
    }
}
