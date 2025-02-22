package com.carlosacademic.qdlsspring.core.domain.usecases;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;

import java.util.List;

public interface GetEnterpriseAndCountryByTypologyUseCase {

    List<EnterpriseCountry> get(Typology typology);
}
