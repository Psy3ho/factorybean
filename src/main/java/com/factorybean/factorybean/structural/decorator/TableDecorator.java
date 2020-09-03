package com.factorybean.factorybean.structural.decorator;

public abstract class TableDecorator implements Table{

    private Table table;

    public TableDecorator(Table table){
        this.table = table;
    }

    @Override
    public String decorate() {
        return table.decorate();
    }
}
