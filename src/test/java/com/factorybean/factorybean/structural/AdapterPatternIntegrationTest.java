package com.factorybean.factorybean.structural;

import com.factorybean.factorybean.structural.adapter.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

public class AdapterPatternIntegrationTest {


    @Test
    public void testCurrencyChange() {
        Valuable mobile = new Mobile();
        Valuable monitor = new Monitor();
        Valuable notebook = new Notebook();

        ValuableAdapter mobileAdapter = new ValuableAdapterImpl(mobile);
        ValuableAdapter monitorAdapter = new ValuableAdapterImpl(monitor);
        ValuableAdapter notebookAdapter = new ValuableAdapterImpl(notebook);

        assertEquals(9007.674, mobileAdapter.getPrice(), 0.0001);
        assertEquals(6025.2, monitorAdapter.getPrice(), 0.0001);
        assertEquals(24070.674, notebookAdapter.getPrice(), 0.0001);
    }
}
