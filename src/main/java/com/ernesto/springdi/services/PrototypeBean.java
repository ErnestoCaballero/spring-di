package com.ernesto.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean implements ScopeService {

    public PrototypeBean() {
        System.out.println("Creating a PROTOTYPE Bean!!!");
    }

    @Override
    public String getMyScope() {
        return "I'm a Prototype";
    }
}
