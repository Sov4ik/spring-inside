package com.envi.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("speaker")
public class SpeakerProperties {

    public SpeakerProperties(){

    }

    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
