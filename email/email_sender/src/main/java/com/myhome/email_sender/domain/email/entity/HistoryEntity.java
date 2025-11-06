package com.myhome.email_sender.domain.email.entity;


import com.myhome.email_sender.common.entity.BaseEntity;
import com.myhome.email_sender.domain.email.EmailSenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Email_History")
public class HistoryEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long reservation_id;

    private EmailSenderEnum.ReserveEmailStatus status;
}
