package com.carlosacademic.qdlsspring.users.domain.usecases;

import com.carlosacademic.qdlsspring.users.domain.model.User;

import java.util.List;

public interface GetAllUsersUseCase {

    List<User> getAll();
}
