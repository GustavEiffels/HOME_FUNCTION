package com.myhome.email_sender.domain.email;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailSenderService {
    private final EmailSenderRepository emailSenderRepository;


    public void createTemplate(EmailSenderDto.TemplateCreateCommand command){
        emailSenderRepository.saveTemplate(command.toDomain());
    }
}
