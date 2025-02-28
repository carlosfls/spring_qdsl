package com.carlosacademic.qdlsspring.core.domain.model;

import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnterpriseAndEstablishmentByTypology {

    private String identificationNumber;

    private String businessName;

    private String businessCode;

    private String country;

    private String description;

    private Typology typology;

    //revisar como poder traer la lista
    //private List<EstablishmentModel> establishments;
}
