package com.carlosacademic.qdlsspring.domain.usecases;

import com.carlosacademic.qdlsspring.domain.model.User;
import com.carlosacademic.qdlsspring.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetUserByUserNameAndActiveUseCaseImpl implements GetUserByUserNameAndActiveUseCase {

    private final UserRepository userRepository;

    @Override
    public User getByUserNameIsActive(String username) {
        return userRepository.getByUsernameIfIsActive(username);
    }
}
