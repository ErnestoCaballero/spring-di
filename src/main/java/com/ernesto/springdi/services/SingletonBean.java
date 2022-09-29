package com.ernesto.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a SINGLETON bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
