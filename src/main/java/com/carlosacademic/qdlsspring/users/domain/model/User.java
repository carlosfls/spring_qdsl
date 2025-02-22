package com.carlosacademic.qdlsspring.users.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private Long id;

    private String username;

    private String password;

    private Boolean isActive;
}
