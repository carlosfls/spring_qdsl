package com.carlosacademic.qdlsspring.application.mapper;

import com.carlosacademic.qdlsspring.application.dto.CreateUserDto;
import com.carlosacademic.qdlsspring.application.dto.ActiveUserByUsernameDto;
import com.carlosacademic.qdlsspring.application.dto.UserCreatedDto;
import com.carlosacademic.qdlsspring.application.dto.UserAllDto;
import com.carlosacademic.qdlsspring.application.dto.UserByUsernameDto;
import com.carlosacademic.qdlsspring.domain.model.User;

public class UserModelDtoMapper {

    private UserModelDtoMapper(){}

    public static User toUser(CreateUserDto dto){
        User u = new User();
        u.setUsername(dto.getUsername());
        u.setPassword(dto.getPassword());
        u.setIsActive(true);

        return u;
    }

    public static UserCreatedDto toUserCreatedDto(User user){
        UserCreatedDto dto = new UserCreatedDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setIsActive(user.getIsActive());

        return dto;
    }

    public static UserAllDto toUserGetAllDto(User user){
        UserAllDto dto = new UserAllDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setIsActive(user.getIsActive());

        return dto;
    }

    public static UserByUsernameDto toUserGetByUsernameDto(User user){
        UserByUsernameDto dto = new UserByUsernameDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setIsActive(user.getIsActive());

        return dto;
    }

    public static ActiveUserByUsernameDto toActiveUserByUsernameDto(User user){
        ActiveUserByUsernameDto dto = new ActiveUserByUsernameDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());

        return dto;
    }
}
