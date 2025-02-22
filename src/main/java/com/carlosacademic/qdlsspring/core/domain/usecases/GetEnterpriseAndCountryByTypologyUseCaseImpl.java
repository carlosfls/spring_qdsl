package com.carlosacademic.qdlsspring.core.domain.usecases;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import com.carlosacademic.qdlsspring.core.infrastructure.repositories.EnterpriseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetEnterpriseAndCountryByTypologyUseCaseImpl implements GetEnterpriseAndCountryByTypologyUseCase {

    private final EnterpriseRepository enterpriseRepository;

    @Override
    public List<EnterpriseCountry> get(Typology typology) {
        return enterpriseRepository.getEnterpriseAndCountryNameByTypology(typology);
    }
}
