package com.carlosacademic.qdlsspring.domain.usecases;

import com.carlosacademic.qdlsspring.domain.model.User;
import com.carlosacademic.qdlsspring.infrastructure.repositories.UserRepository;
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
