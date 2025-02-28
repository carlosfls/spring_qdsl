package com.carlosacademic.qdlsspring.core.domain.usecases;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseAndEstablishmentByTypology;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;

import java.util.List;

public interface GetEnterpriseAndEstablishmentByTypologyUseCase {

    List<EnterpriseAndEstablishmentByTypology> getEnterpriseAndEstablishmentByTypology(Typology typology);
}
