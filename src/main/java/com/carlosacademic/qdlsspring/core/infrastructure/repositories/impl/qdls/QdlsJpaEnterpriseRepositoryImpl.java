package com.carlosacademic.qdlsspring.core.infrastructure.repositories.impl.qdls;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseAndEstablishmentByTypology;
import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;
import com.carlosacademic.qdlsspring.core.domain.model.EstablishmentModel;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import com.carlosacademic.qdlsspring.core.infrastructure.model.QEnterprise;
import com.carlosacademic.qdlsspring.core.infrastructure.repositories.EnterpriseRepository;
import com.carlosacademic.qdlsspring.core.infrastructure.repositories.JpaEnterpriseRepository;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QdlsJpaEnterpriseRepositoryImpl implements EnterpriseRepository {

    private final JpaEnterpriseRepository jpaEnterpriseRepository;
    private final JPAQueryFactory jpaQueryFactory;

    //Usando proyecciones en jpa
    @Override
    public List<EnterpriseCountry> getEnterpriseAndCountryNameByTypology(Typology typology) {
        return jpaEnterpriseRepository.getEnterpriseAndCountryNameByTypology(typology);
    }

    //Usando proyecciones con QDLS
    @Override
    public List<EnterpriseAndEstablishmentByTypology> getEnterpriseAndEstablishmentByTypology(Typology typology) {
        QEnterprise qEnterprise = QEnterprise.enterprise;
        return jpaQueryFactory.from(qEnterprise)
                .select(Projections.constructor(EnterpriseAndEstablishmentByTypology.class,
                        qEnterprise.identificationNumber,
                        qEnterprise.businessName,
                        qEnterprise.businessCode,
                        qEnterprise.country.name,
                        qEnterprise.description,
                        qEnterprise.typology))
                .where(qEnterprise.typology.eq(typology))
                .fetch();
    }
}
