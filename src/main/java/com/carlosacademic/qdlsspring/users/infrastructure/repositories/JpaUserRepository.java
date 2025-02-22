package com.carlosacademic.qdlsspring.users.infrastructure.repositories;

import com.carlosacademic.qdlsspring.users.infrastructure.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
