package com.myhome.email_sender.infrastructure.member;

import com.myhome.email_sender.domain.member.MemberEntity;

import java.util.Optional;

public interface MemberJpaRepositoryCustom {
    Optional<MemberEntity> findMemberByEmail(String email);
}
