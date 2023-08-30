package com.learning.springex.springexample.exceptions;

public class ApplicationException extends RuntimeException{
    public ApplicationException(String message){
        super(message);
    }
}
