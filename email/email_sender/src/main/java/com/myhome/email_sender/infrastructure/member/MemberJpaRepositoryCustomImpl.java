package com.myhome.email_sender.infrastructure.member;


import com.myhome.email_sender.domain.member.MemberEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.myhome.email_sender.domain.member.QMemberEntity.memberEntity;

@Repository
@RequiredArgsConstructor
public class MemberJpaRepositoryCustomImpl implements MemberJpaRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public Optional<MemberEntity> findMemberByEmail(String email) {
        return Optional.ofNullable(
                queryFactory.selectFrom(memberEntity)
                        .where(memberEntity.email.eq(email).and(memberEntity.isDelete.isFalse()))
                        .fetchOne()
        );
    }
}
