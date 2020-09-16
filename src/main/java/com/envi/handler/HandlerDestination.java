package com.envi.handler;

import com.envi.properties.SpeakerProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HandlerDestination {

    @Autowired
    private SpeakerProperties speakerProperties;

    public void handlerSpeaker(){
        System.out.println("Get destination: " + speakerProperties.getDestination());
    }
}
