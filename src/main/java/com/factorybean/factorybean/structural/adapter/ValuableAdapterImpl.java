package com.factorybean.factorybean.structural.adapter;

public class ValuableAdapterImpl implements ValuableAdapter{
    private Valuable valuable;
    public ValuableAdapterImpl(Valuable valuable){
        this.valuable = valuable;
    }

    @Override
    public double getPrice() {
        double slovakCurrency = valuable.getPrice();
        return convertCurrency(slovakCurrency);
    }

    private double convertCurrency(double slovakCurrency){
        return slovakCurrency * 30.126;
    }
}
