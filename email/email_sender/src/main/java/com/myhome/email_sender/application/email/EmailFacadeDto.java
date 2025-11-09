package com.myhome.email_sender.application.email;

import com.myhome.email_sender.domain.email.EmailSenderDto;

public record EmailFacadeDto() {

    public record CreateTemplateCriteria(
            Long memberId,
            String templateTitle,
            String templateContents
    ){
        public EmailSenderDto.TemplateCreateCommand toDomain(){
            return new EmailSenderDto.TemplateCreateCommand(
                    memberId,
                    templateTitle,
                    templateContents
            );
        }
    }

    public record CreateTemplateResult(){
    }
}
