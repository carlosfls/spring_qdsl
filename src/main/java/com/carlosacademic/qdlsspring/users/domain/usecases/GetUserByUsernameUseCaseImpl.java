package com.carlosacademic.qdlsspring.users.domain.usecases;

import com.carlosacademic.qdlsspring.users.domain.model.User;
import com.carlosacademic.qdlsspring.users.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetUserByUsernameUseCaseImpl implements GetUserByUsernameUseCase {

    private final UserRepository userRepository;

    @Override
    public User getByUsername(String username) {
        return userRepository.getByUsername(username);
    }
}
