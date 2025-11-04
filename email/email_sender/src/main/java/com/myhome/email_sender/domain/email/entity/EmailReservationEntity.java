package com.myhome.email_sender.domain.email.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Email_Reservation")
public class EmailReservationEntity {
}
