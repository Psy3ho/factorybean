package com.factorybean.factorybean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class NoSingleUserFactory extends AbstractFactoryBean<User> {

    private int factoryId;
    private int userId;


    public NoSingleUserFactory(){
        setSingleton(false);
    }

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
    public Class<?> getObjectType() {
        return  User.class;
    }

    @Override
    protected User createInstance() throws Exception {
        return new User(userId);
    }
}
