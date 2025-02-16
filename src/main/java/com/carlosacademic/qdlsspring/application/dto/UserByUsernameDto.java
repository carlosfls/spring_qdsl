package com.carlosacademic.qdlsspring.application.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserByUsernameDto {

    private Long id;

    private String username;

    private String password;

    private Boolean isActive;
}
