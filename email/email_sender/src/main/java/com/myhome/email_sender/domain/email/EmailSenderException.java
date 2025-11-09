package com.myhome.email_sender.domain.email;

import com.myhome.email_sender.common.exceptions.ExceptionInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EmailSenderException implements ExceptionInterface {

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
