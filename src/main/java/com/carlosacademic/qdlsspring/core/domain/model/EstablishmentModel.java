package com.carlosacademic.qdlsspring.core.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstablishmentModel {

    private Long id;

    private String city;

    private String code;

    private String name;

    private double longitude;

    private double latitude;

    private String email;

    private String phone;

    private String address;
}
