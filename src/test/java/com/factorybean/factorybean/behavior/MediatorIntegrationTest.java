package com.factorybean.factorybean.behavior;

import com.factorybean.factorybean.behavioral.mediator.Button;
import com.factorybean.factorybean.behavioral.mediator.Fan;
import com.factorybean.factorybean.behavioral.mediator.Mediator;
import com.factorybean.factorybean.behavioral.mediator.PowerSupplier;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MediatorIntegrationTest {

    private com.factorybean.factorybean.behavioral.mediator.Button button;
    private Fan fan;

    @Before
    public void setUp() {
        this.button = new Button();
        this.fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setButton(this.button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);
    }

    @Test
    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        assertFalse(fan.isOn());

        button.press();
        assertTrue(fan.isOn());

        button.press();
        assertFalse(fan.isOn());
    }
}