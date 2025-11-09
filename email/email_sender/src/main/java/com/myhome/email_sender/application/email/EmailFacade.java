package com.myhome.email_sender.application.email;

import com.myhome.email_sender.domain.email.EmailSenderService;
import com.myhome.email_sender.domain.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailFacade {
    private final EmailSenderService emailSenderService;
    private final MemberService memberService;

    // Create Template
    public void createTemplate(EmailFacadeDto.CreateTemplateCriteria criteria){
        memberService.getMember(criteria.memberId());
        emailSenderService.createTemplate(criteria.toDomain());
    }
}
