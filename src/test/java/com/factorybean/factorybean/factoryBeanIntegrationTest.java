package com.factorybean.factorybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FactoryBeanAppConfig.class)
public class factoryBeanIntegrationTest {

    @Resource(name = "&user")
    private UserFactory userFactory;

    @Resource(name = "&user1")
    private UserFactory userFactory1;


    @Resource(name = "&singletonUser")
    private SingleUserFactory singleUserFactory;

    @Resource(name = "&singletonUser")
    private SingleUserFactory singleUserFactory1;


    @Resource(name = "&noSingletonUser")
    private NoSingleUserFactory noSingleUserFactory;

    @Resource(name = "&noSingletonUser")
    private NoSingleUserFactory noSingleUserFactory1;

    @Test
    public void testUserFactory() {
        assertThat(userFactory.getUserId(), equalTo(2));
        assertThat(userFactory.getFactoryId(), equalTo(7070));
        assertThat(userFactory1.getUserId(), equalTo(3));
        assertThat(userFactory1.getFactoryId(), equalTo(8080));
        assertNotSame(userFactory.getFactoryId(), userFactory1.getFactoryId());
        assertNotSame(userFactory.getUserId(), userFactory1.getUserId());
        assertFalse(userFactory.isSingleton());
        assertFalse(userFactory1.isSingleton());
    }

    @Test
    public void testSingleUserFactory() {
        assertThat(singleUserFactory.getUserId(), equalTo(1));
        assertThat(singleUserFactory.getFactoryId(), equalTo(1010));
        assertThat(singleUserFactory1.getUserId(), equalTo(1));
        assertThat(singleUserFactory1.getFactoryId(), equalTo(1010));
        assertSame(singleUserFactory, singleUserFactory1);
        assertTrue(singleUserFactory.isSingleton());
        assertTrue(singleUserFactory1.isSingleton());
    }

    @Test
    public void testNoSingleUserFactory() {
        assertThat(noSingleUserFactory.getUserId(), equalTo(0));
        assertThat(noSingleUserFactory.getFactoryId(), equalTo(2020));
        assertThat(noSingleUserFactory1.getUserId(), equalTo(0));
        assertThat(noSingleUserFactory1.getFactoryId(), equalTo(2020));
        assertNotSame(noSingleUserFactory.getFactoryId(),noSingleUserFactory1.getFactoryId());
        assertFalse(noSingleUserFactory.isSingleton());
        assertFalse(noSingleUserFactory1.isSingleton());
    }


}
