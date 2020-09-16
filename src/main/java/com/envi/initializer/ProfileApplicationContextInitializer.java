package com.envi.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        if(configurableApplicationContext.getEnvironment().getActiveProfiles().length == 0){
            throw new IllegalStateException("Can't find eny profile");
        }
    }
}
