package com.myhome.email_sender.infrastructure.member;

import com.myhome.email_sender.common.repository.SoftDeleteRepository;
import com.myhome.email_sender.domain.member.MemberEntity;

public interface MemberJpaRepository extends SoftDeleteRepository<MemberEntity,Long>, MemberJpaRepositoryCustom {
}
