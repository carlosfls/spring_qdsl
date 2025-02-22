package com.carlosacademic.qdlsspring.users.domain.usecases;

import com.carlosacademic.qdlsspring.users.domain.model.User;
import com.carlosacademic.qdlsspring.users.infrastructure.repositories.UserRepository;
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
