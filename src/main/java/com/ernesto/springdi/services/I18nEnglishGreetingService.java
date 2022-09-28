package com.ernesto.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - ENGLISH";
    }
}
