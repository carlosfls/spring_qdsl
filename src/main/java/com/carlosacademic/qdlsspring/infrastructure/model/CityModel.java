package com.carlosacademic.qdlsspring.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.UUID;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "city")
public class CityModel extends AbstractBaseAuditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "longitude", columnDefinition="Decimal(60,30)")
    private Double longitude;

    @Column(name = "latitude",  columnDefinition="Decimal(60,30)")
    private Double latitude;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "external_code")
    private String externalCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private CountryModel countryModel;

    @PrePersist
    public void prePersist(){
        this.createdAt = new Date(System.currentTimeMillis());
        this.uuid = UUID.randomUUID().toString();
        this.setIsActive(true);
    }
}
