package com.myhome.email_sender.common.exceptions;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final String code;
    private final String message;

    public CustomException(ExceptionInterface exceptionInterface){
        super(exceptionInterface.getMessage());
        this.code = exceptionInterface.getCode();
        this.message = exceptionInterface.getMessage();
    }

    public CustomException(ExceptionInterface exceptionInterface, String message){
        super(exceptionInterface.getMessage()+"-"+message);
        this.code = exceptionInterface.getCode();
        this.message = exceptionInterface.getMessage()+"-"+message;
    }
}
