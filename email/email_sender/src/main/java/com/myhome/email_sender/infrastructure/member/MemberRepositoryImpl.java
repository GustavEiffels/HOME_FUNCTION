package com.myhome.email_sender.infrastructure.member;


import com.myhome.email_sender.domain.member.MemberEntity;
import com.myhome.email_sender.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberJpaRepository memberJpaRepository;
    @Override
    public MemberEntity save(MemberEntity memberEntity) {
        return memberJpaRepository.save(memberEntity);
    }

    @Override
    public Optional<MemberEntity> findMemberByEmail(String email) {
        return memberJpaRepository.findMemberByEmail(email);
    }

    @Override
    public Optional<MemberEntity> findMember(Long memberId) {
        return memberJpaRepository.findById(memberId);
    }
}
