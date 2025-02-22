package com.carlosacademic.qdlsspring.users.infrastructure.mapper;

import com.carlosacademic.qdlsspring.users.domain.model.User;
import com.carlosacademic.qdlsspring.users.infrastructure.model.UserEntity;

public class UserModelEntityMapper {

    private UserModelEntityMapper(){}

    public static User toUser(UserEntity userModel){
        User u = new User();
        u.setId(userModel.getId());
        u.setUsername(userModel.getUsername());
        u.setPassword(userModel.getPassword());
        u.setIsActive(userModel.getIsActive());

        return u;
    }

    public static UserEntity toEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setIsActive(user.getIsActive());

        return userEntity;
    }
}
