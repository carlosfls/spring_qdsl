package com.carlosacademic.qdlsspring.core.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnterpriseCountryDto {

    private String identificationNumber;

    private String businessName;

    private String businessCode;

    private String description;

    private String countryName;
}
