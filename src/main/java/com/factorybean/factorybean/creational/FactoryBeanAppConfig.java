package com.factorybean.factorybean.creational;

import com.factorybean.factorybean.creational.abstractfactory.prototype.NoSingleUserFactory;
import com.factorybean.factorybean.creational.abstractfactory.singleton.SingleUserFactory;
import com.factorybean.factorybean.creational.factory.UserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanAppConfig {

    @Bean(name = "user")
    public UserFactory userFactory() {
        UserFactory factory = new UserFactory();
        factory.setFactoryId(7070);
        factory.setUserId(2);
        return factory;
    }

    @Bean
    public User user() throws Exception {
        return userFactory().getObject();
    }

    @Bean(name = "user1")
    public UserFactory userFactory1() {
        UserFactory factory = new UserFactory();
        factory.setFactoryId(8080);
        factory.setUserId(3);
        return factory;
    }

    @Bean(name = "singletonUser")
    public SingleUserFactory singleUserFactory() {
        SingleUserFactory factory = new SingleUserFactory();
        factory.setFactoryId(1010);
        factory.setUserId(1);
        return factory;
    }

    @Bean(name = "noSingletonUser")
    public NoSingleUserFactory noSingleUserFactory() {
        NoSingleUserFactory factory = new NoSingleUserFactory();
        factory.setFactoryId(2020);
        factory.setUserId(0);
        return factory;
    }
}
