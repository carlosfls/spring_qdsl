package com.carlosacademic.qdlsspring.users.infrastructure.repositories;

import com.carlosacademic.qdlsspring.users.domain.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User getByUsername(String username);

    User getByUsernameIfIsActive(String username);

    User create(User user);
}
