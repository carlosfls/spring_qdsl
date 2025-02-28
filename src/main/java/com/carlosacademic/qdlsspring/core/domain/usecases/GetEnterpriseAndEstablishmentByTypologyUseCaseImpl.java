package com.carlosacademic.qdlsspring.core.domain.usecases;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseAndEstablishmentByTypology;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import com.carlosacademic.qdlsspring.core.infrastructure.repositories.EnterpriseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetEnterpriseAndEstablishmentByTypologyUseCaseImpl implements GetEnterpriseAndEstablishmentByTypologyUseCase {

    private final EnterpriseRepository enterpriseRepository;

    @Override
    public List<EnterpriseAndEstablishmentByTypology> getEnterpriseAndEstablishmentByTypology(Typology typology) {
        return enterpriseRepository.getEnterpriseAndEstablishmentByTypology(typology);
    }
}
