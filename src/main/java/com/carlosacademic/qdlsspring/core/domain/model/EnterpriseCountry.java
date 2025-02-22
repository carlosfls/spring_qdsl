package com.carlosacademic.qdlsspring.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseCountry {

    private String identificationNumber;

    private String businessName;

    private String businessCode;

    private String description;

    private String countryName;
}
