package com.carlosacademic.qdlsspring.application.controllers;

import com.carlosacademic.qdlsspring.application.dto.ActiveUserByUsernameDto;
import com.carlosacademic.qdlsspring.application.dto.CreateUserDto;
import com.carlosacademic.qdlsspring.application.dto.UserAllDto;
import com.carlosacademic.qdlsspring.application.dto.UserByUsernameDto;
import com.carlosacademic.qdlsspring.application.dto.UserCreatedDto;
import com.carlosacademic.qdlsspring.application.mapper.UserModelDtoMapper;
import com.carlosacademic.qdlsspring.domain.model.User;
import com.carlosacademic.qdlsspring.domain.usecases.CreateUserUseCase;
import com.carlosacademic.qdlsspring.domain.usecases.GetAllUsersUseCase;
import com.carlosacademic.qdlsspring.domain.usecases.GetUserByUserNameAndActiveUseCase;
import com.carlosacademic.qdlsspring.domain.usecases.GetUserByUsernameUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final GetAllUsersUseCase getAllUsersUseCase;
    private final GetUserByUsernameUseCase getUserByUsernameUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final GetUserByUserNameAndActiveUseCase getUserByUserNameAndActiveUseCase;

    @GetMapping
    public ResponseEntity<List<UserAllDto>> getAll(){
        List<UserAllDto> responseList = getAllUsersUseCase.getAll().stream()
                .map(UserModelDtoMapper::toUserGetAllDto)
                .toList();

        return ResponseEntity.ok(responseList);
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserByUsernameDto> getUserByUsername(@PathVariable String username){
        UserByUsernameDto response = Optional.ofNullable(getUserByUsernameUseCase.getByUsername(username))
                .map(UserModelDtoMapper::toUserGetByUsernameDto)
                .orElse(null);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/active/{username}")
        public ResponseEntity<ActiveUserByUsernameDto> getActiveUserByUsername(@PathVariable String username){
        ActiveUserByUsernameDto response = Optional.ofNullable(getUserByUserNameAndActiveUseCase.getByUserNameIsActive(username))
                .map(UserModelDtoMapper::toActiveUserByUsernameDto)
                .orElse(null);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<UserCreatedDto> create(@RequestBody CreateUserDto request){
        User user = UserModelDtoMapper.toUser(request);
        UserCreatedDto response = Optional.ofNullable(createUserUseCase.create(user))
                .map(UserModelDtoMapper::toUserCreatedDto)
                .orElse(null);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
