package com.envi.handler;

import org.aspectj.lang.annotation.Before;

public class HandlerAspect {

    @Before("execution(* com.envi.service..*.*(..))")
    public void handlerSpeaker(){

    }
}
