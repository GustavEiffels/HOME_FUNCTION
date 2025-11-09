package com.myhome.email_sender.domain.member;


import com.myhome.email_sender.common.exceptions.ExceptionInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MemberException implements ExceptionInterface {
    ALREADY_EXIST("MEMBER_ALREADY_EXIST","이미 존재하는 이메일 입니다."),
    NOT_EXIST("MEMBER_NOT_EXIST","존재하지 않은 사용자 입니다."),
    EMAIL_REG_EXCEPTION("MEMBER_EMAIL_REG_EXCEPTION","이메일 정규식에 맞지 않습니다.")
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
