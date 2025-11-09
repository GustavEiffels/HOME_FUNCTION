package com.myhome.email_sender.interfaces.api.member;

import com.myhome.email_sender.common.exceptions.CustomException;
import com.myhome.email_sender.domain.member.MemberEnum;
import com.myhome.email_sender.domain.member.MemberException;

import java.util.regex.Pattern;

public record MemberApiDto() {

    // Create
    public record CreateRequest(String email){
        public CreateRequest{
            if(!Pattern.compile(MemberEnum.Reg.EMAIL.getReg()).matcher(email).matches()){
                throw new CustomException(MemberException.EMAIL_REG_EXCEPTION);
            }
        }
    }

    // Find
    public record FindRequest(String email){
        public FindRequest{
            if(!Pattern.compile(MemberEnum.Reg.EMAIL.getReg()).matcher(email).matches()){
                throw new CustomException(MemberException.EMAIL_REG_EXCEPTION);
            }
        }
    }

}
