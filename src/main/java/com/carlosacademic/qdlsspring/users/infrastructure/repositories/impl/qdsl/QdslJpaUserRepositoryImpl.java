package com.carlosacademic.qdlsspring.users.infrastructure.repositories.impl.qdsl;

import com.carlosacademic.qdlsspring.users.domain.model.User;
import com.carlosacademic.qdlsspring.users.infrastructure.mapper.UserModelEntityMapper;
import com.carlosacademic.qdlsspring.users.infrastructure.model.QUserEntity;
import com.carlosacademic.qdlsspring.users.infrastructure.repositories.JpaUserRepository;
import com.carlosacademic.qdlsspring.users.infrastructure.repositories.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class QdslJpaUserRepositoryImpl implements UserRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final JpaUserRepository jpaUserRepository;

    @Override
    public List<User> getAll() {
        QUserEntity qUserModel = QUserEntity.userEntity;
        return jpaQueryFactory.selectFrom(qUserModel)
                .stream()
                .map(UserModelEntityMapper::toUser)
                .collect(Collectors.toList());
    }

    @Override
    public User getByUsername(String username) {
        QUserEntity qUserModel = QUserEntity.userEntity;
        return jpaQueryFactory.selectFrom(qUserModel)
                .where(qUserModel.username.eq(username))
                .stream()
                .findFirst()
                .map(UserModelEntityMapper::toUser)
                .orElse(null);
    }

    @Override
    public User getByUsernameIfIsActive(String username) {
        QUserEntity qUserModel = QUserEntity.userEntity;
        return jpaQueryFactory.selectFrom(qUserModel)
                .where(qUserModel.username.eq(username).and(qUserModel.isActive))
                .stream()
                .findFirst()
                .map(UserModelEntityMapper::toUser)
                .orElse(null);
    }

    @Override
    public User create(User user) {
        return Optional.of(user)
                .map(UserModelEntityMapper::toEntity)
                .map(jpaUserRepository::save)
                .map(UserModelEntityMapper::toUser)
                .orElse(null);
    }
}
