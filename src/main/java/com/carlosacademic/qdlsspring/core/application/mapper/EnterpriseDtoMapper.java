package com.carlosacademic.qdlsspring.core.application.mapper;

import com.carlosacademic.qdlsspring.core.application.dto.EnterpriseCountryDto;
import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;

public class EnterpriseDtoMapper {

    private EnterpriseDtoMapper(){}

    public static com.carlosacademic.qdlsspring.core.application.dto.EnterpriseCountryDto enterpriseCountryDto(EnterpriseCountry model){
       com.carlosacademic.qdlsspring.core.application.dto.EnterpriseCountryDto dto = new EnterpriseCountryDto();
       dto.setIdentificationNumber(model.getIdentificationNumber());
       dto.setBusinessCode(model.getBusinessCode());
       dto.setBusinessName(model.getBusinessName());
       dto.setDescription(model.getDescription());
       dto.setCountryName(model.getCountryName());

        return dto;
    }
}
