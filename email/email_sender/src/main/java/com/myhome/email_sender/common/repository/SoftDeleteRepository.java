package com.myhome.email_sender.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface SoftDeleteRepository<T,ID> extends JpaRepository<T,ID> {

    @Query("SELECT e FROM #{#entityName} e WHERE e.isDelete = true")
    List<T> findDelete();

    @Override
    @Query("SELECT e FROM #{#entityName} e WHERE e.id = ?1 AND e.isDelete = false")
    Optional<T> findById(ID id);
}
