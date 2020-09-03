package com.factorybean.factorybean.structural.proxy;

public class MobileProxy implements Mobile{
    private static Mobile mobile;
    @Override
    public void start() {
        if(mobile == null) {
            mobile = new MobileImpl();
        }
        mobile.start();
    }
}
