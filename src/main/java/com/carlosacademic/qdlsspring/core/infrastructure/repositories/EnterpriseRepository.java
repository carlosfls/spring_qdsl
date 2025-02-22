package com.carlosacademic.qdlsspring.core.infrastructure.repositories;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;

import java.util.List;

public interface EnterpriseRepository {

    List<EnterpriseCountry> getEnterpriseAndCountryNameByTypology(Typology typology);
}
