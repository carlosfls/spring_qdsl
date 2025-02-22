package com.carlosacademic.qdlsspring.users.domain.usecases;

import com.carlosacademic.qdlsspring.users.domain.model.User;
import com.carlosacademic.qdlsspring.users.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepository userRepository;

    @Override
    public com.carlosacademic.qdlsspring.users.domain.model.User create(User user) {
        return userRepository.create(user);

    }
}
