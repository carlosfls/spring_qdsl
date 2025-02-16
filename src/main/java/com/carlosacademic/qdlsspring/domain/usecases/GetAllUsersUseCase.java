package com.carlosacademic.qdlsspring.domain.usecases;

import com.carlosacademic.qdlsspring.domain.model.User;

import java.util.List;

public interface GetAllUsersUseCase {

    List<User> getAll();
}
