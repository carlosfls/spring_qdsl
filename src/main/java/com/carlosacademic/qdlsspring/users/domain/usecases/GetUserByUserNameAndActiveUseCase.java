package com.carlosacademic.qdlsspring.users.domain.usecases;

import com.carlosacademic.qdlsspring.users.domain.model.User;

public interface GetUserByUserNameAndActiveUseCase {

    User getByUserNameIsActive(String username);
}
