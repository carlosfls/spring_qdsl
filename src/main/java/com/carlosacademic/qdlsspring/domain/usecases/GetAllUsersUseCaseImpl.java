package com.carlosacademic.qdlsspring.domain.usecases;

import com.carlosacademic.qdlsspring.domain.model.User;
import com.carlosacademic.qdlsspring.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllUsersUseCaseImpl implements GetAllUsersUseCase {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
