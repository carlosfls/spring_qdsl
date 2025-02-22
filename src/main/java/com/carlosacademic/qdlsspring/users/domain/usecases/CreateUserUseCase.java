package com.carlosacademic.qdlsspring.users.domain.usecases;

import com.carlosacademic.qdlsspring.users.domain.model.User;

public interface CreateUserUseCase {

    User create(User user);
}
