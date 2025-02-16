package com.carlosacademic.qdlsspring.domain.usecases;

import com.carlosacademic.qdlsspring.domain.model.User;

public interface GetUserByUsernameUseCase {

    User getByUsername(String username);
}
