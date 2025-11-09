package com.myhome.email_sender.domain.member;

import java.util.Optional;

public interface MemberRepository {

    MemberEntity save(MemberEntity memberEntity);

    Optional<MemberEntity> findMemberByEmail(String email);

    Optional<MemberEntity> findMember(Long memberId);
}
