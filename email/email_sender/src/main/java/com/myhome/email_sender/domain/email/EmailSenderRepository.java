package com.myhome.email_sender.domain.email;

import com.myhome.email_sender.domain.email.entity.TemplateEntity;

public interface EmailSenderRepository {
    TemplateEntity saveTemplate(TemplateEntity template);
}
