package com.carlosacademic.qdlsspring.users.application.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ActiveUserByUsernameDto {

    private Long id;

    private String username;

    private String password;
}
