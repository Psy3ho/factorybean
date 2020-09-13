package com.factorybean.factorybean.behavior;

import com.factorybean.factorybean.behavioral.state.DeliveredState;
import com.factorybean.factorybean.behavioral.state.OrderedState;
import com.factorybean.factorybean.behavioral.state.Package;
import com.factorybean.factorybean.behavioral.state.ReceivedState;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class StatePatternUnitTest {

    @Test
    public void givenNewPackage_whenPackageReceived_thenStateReceived() {
        Package pkg = new Package();

        assertThat(pkg.getState(), instanceOf(OrderedState.class));
        pkg.nextState();

        assertThat(pkg.getState(), instanceOf(DeliveredState.class));
        pkg.nextState();

        assertThat(pkg.getState(), instanceOf(ReceivedState.class));
    }

    @Test
    public void givenDeliveredPackage_whenPrevState_thenStateOrdered() {
        Package pkg = new Package();
        pkg.setState(new DeliveredState());
        pkg.previousState();

        assertThat(pkg.getState(), instanceOf(OrderedState.class));
    }
}