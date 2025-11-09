package com.myhome.email_sender.common.exceptions;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CommonException implements ExceptionInterface{

    ;

    private final String code;
    private final String message;

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
