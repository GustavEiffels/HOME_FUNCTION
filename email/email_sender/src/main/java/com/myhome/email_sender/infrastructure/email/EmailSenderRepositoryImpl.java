package com.myhome.email_sender.infrastructure.email;

import com.myhome.email_sender.domain.email.EmailSenderRepository;
import com.myhome.email_sender.domain.email.entity.TemplateEntity;
import com.myhome.email_sender.infrastructure.email.jpa.TemplateJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmailSenderRepositoryImpl implements EmailSenderRepository {
    private final TemplateJpaRepository templateJpaRepository;
    @Override
    public TemplateEntity saveTemplate(TemplateEntity template) {
        return templateJpaRepository.save(template);
    }
}
