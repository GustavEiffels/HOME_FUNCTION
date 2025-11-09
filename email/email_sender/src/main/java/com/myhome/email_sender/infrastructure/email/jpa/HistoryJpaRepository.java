package com.myhome.email_sender.infrastructure.email.jpa;

import com.myhome.email_sender.common.repository.SoftDeleteRepository;
import com.myhome.email_sender.domain.email.entity.HistoryEntity;

public interface HistoryJpaRepository extends SoftDeleteRepository<HistoryEntity,Long> {
}
