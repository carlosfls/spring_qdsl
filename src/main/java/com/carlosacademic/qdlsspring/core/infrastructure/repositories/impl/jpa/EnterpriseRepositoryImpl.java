package com.carlosacademic.qdlsspring.core.infrastructure.repositories.impl.jpa;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import com.carlosacademic.qdlsspring.core.infrastructure.repositories.EnterpriseRepository;
import com.carlosacademic.qdlsspring.core.infrastructure.repositories.JpaEnterpriseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EnterpriseRepositoryImpl implements EnterpriseRepository {

    private final JpaEnterpriseRepository jpaEnterpriseRepository;

    @Override
    public List<EnterpriseCountry> getEnterpriseAndCountryNameByTypology(Typology typology) {
        return jpaEnterpriseRepository.getEnterpriseAndCountryNameByTypology(typology);
    }
}
