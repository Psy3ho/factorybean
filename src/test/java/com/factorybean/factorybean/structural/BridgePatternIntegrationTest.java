package com.factorybean.factorybean.structural;

import com.factorybean.factorybean.structural.bridge.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgePatternIntegrationTest {
    @Test
    public void testCarColor() {
        Car skoda = new Skoda(new Black());
        Car audi = new Audi(new Red());
        assertEquals("Skoda is black", skoda.paint());
        assertEquals("Audi is red", audi.paint());
    }
}
