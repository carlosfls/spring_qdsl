package com.carlosacademic.qdlsspring.core.infrastructure.repositories;

import com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import com.carlosacademic.qdlsspring.core.infrastructure.model.EnterpriseV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaEnterpriseRepository extends JpaRepository<EnterpriseV2, Long> {

    @Query(
            """
            select new com.carlosacademic.qdlsspring.core.domain.model.EnterpriseCountry
            (e.identificationNumber, e.businessName, e.businessCode, e.description, c.name)
            from EnterpriseV2 e
            inner join CityModel c on e.countryId = c.id
            where e.typology = :typology
            """
    )
    List<EnterpriseCountry> getEnterpriseAndCountryNameByTypology(Typology typology);
}
