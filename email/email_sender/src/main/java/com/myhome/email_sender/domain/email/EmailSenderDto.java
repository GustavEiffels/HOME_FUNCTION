package com.myhome.email_sender.domain.email;

import com.myhome.email_sender.domain.email.entity.TemplateEntity;

public record EmailSenderDto() {

    public record TemplateCreateCommand(
            Long memberId,
            String templateTitle,
            String templateContents
    ){
        public TemplateEntity toDomain(){
            return new TemplateEntity(
                    null,
                    memberId,
                    templateTitle,
                    templateContents
            );
        }
    }

    public record TemplateCreateInfo(){}
}
