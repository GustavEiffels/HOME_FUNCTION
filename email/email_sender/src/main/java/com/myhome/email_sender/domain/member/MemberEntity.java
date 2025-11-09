package com.myhome.email_sender.domain.member;

import com.myhome.email_sender.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(
        name = "Member",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"email"}
                )
        }
)
public class MemberEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;

    public static MemberEntity create(String email){
        return  new MemberEntity(null,email);
    }
}
