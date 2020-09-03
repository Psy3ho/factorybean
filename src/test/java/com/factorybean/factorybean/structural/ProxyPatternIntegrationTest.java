package com.factorybean.factorybean.structural;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.factorybean.factorybean.structural.proxy.Mobile;
import com.factorybean.factorybean.structural.proxy.MobileImpl;
import com.factorybean.factorybean.structural.proxy.MobileProxy;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProxyPatternIntegrationTest {

    @Test
    public void testProxyPattern() throws Exception{

        Logger fooLogger = (Logger) LoggerFactory.getLogger(MobileImpl.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();

        fooLogger.addAppender(listAppender);

        Mobile mobile = new MobileProxy();
        mobile.start();
        mobile.start();
        mobile.start();
        mobile.start();
        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("Initial configuration...",logsList.get(0).getMessage());
        assertEquals("Mobile start",logsList.get(1).getMessage());
        assertEquals("Mobile start",logsList.get(2).getMessage());
        assertEquals("Mobile start",logsList.get(3).getMessage());
        assertEquals("Mobile start",logsList.get(4).getMessage());
    }
}
