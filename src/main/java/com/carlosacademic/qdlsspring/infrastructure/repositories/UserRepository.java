package com.carlosacademic.qdlsspring.infrastructure.repositories;

import com.carlosacademic.qdlsspring.domain.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User getByUsername(String username);

    User getByUsernameIfIsActive(String username);

    User create(User user);
}
