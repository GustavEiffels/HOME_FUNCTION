package com.myhome.email_sender.domain.email.entity;

import com.myhome.email_sender.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Email_Template")
public class TemplateEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    private String emailTemplate;
}
