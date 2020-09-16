package com.envi.exeption;

public class SomeServiceException extends RuntimeException{
    public SomeServiceException(String message){
        super(message);
    }
}
