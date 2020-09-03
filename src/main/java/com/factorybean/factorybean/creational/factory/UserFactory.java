package com.factorybean.factorybean.creational.factory;

import com.factorybean.factorybean.creational.User;
import org.springframework.beans.factory.FactoryBean;

/*
    Produce objects of the type User
 */

public class UserFactory implements FactoryBean<User> {

    private int factoryId;
    private int userId;

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public User getObject() throws Exception {
        return new User(userId);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
