package com.myhome.email_sender.domain.member;

import lombok.RequiredArgsConstructor;

public interface MemberEnum {

    @RequiredArgsConstructor
    enum Reg{
        EMAIL("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
        ;
        Reg(String reg){
            this.reg = reg;
        }
        private String reg;

        public String getReg(){
            return this.reg;
        }
    }

}
