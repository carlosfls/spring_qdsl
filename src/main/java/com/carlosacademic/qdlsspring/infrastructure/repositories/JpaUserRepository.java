package com.carlosacademic.qdlsspring.infrastructure.repositories;

import com.carlosacademic.qdlsspring.infrastructure.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
