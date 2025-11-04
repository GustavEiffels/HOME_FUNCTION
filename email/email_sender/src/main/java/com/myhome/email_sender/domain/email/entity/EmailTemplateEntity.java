package com.myhome.email_sender.domain.email.entity;

import com.myhome.email_sender.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Email_Template")
public class EmailTemplateEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long memberId;
    private Long templateId;
    private LocalDateTime reservationTime;

}
