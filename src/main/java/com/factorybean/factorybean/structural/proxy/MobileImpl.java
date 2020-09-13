package com.factorybean.factorybean.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobileImpl implements Mobile {

    static final Logger LOGGER = LoggerFactory.getLogger(MobileImpl.class);

    public MobileImpl() {
        initialConfiguration();
    }

    @Override
    public void start() {
        LOGGER.info("Mobile start");
    }

    private void initialConfiguration() {
        LOGGER.info("Initial configuration...");
    }
}
