package com.envi.config;

import com.envi.annotation.ConditionalOnProduct;
import com.envi.handler.HandlerAspect;
import com.envi.handler.HandlerDestination;
import com.envi.properties.SpeakerProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableConfigurationProperties(SpeakerProperties.class)
public class StarterConfig {

    @Bean
    @ConditionalOnProduct
    public HandlerAspect handlerAspect(){
        return new HandlerAspect();
    }

    @Bean
    @ConditionalOnProperty("speaker.destination")
    public HandlerDestination handlerDestination(){
        return new HandlerDestination();
    }
}
