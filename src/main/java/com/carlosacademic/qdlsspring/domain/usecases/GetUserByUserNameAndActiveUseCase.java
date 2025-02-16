package com.carlosacademic.qdlsspring.domain.usecases;

import com.carlosacademic.qdlsspring.domain.model.User;

public interface GetUserByUserNameAndActiveUseCase {

    User getByUserNameIsActive(String username);
}
