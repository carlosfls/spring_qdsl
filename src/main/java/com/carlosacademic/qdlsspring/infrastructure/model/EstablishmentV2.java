package com.carlosacademic.qdlsspring.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@Entity
@Table(name = "establishment_v2")
public class EstablishmentV2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "enterprise_id")
    private long enterpriseId;

    @Column(name = "city_id")
    private long cityId;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column (name= "business_code")
    private String businessCode;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "schedule")
    private String schedule;

    @Column(name = "address")
    private String address;

    @Column(name="has_parking", columnDefinition = "TINYINT UNSIGNED default 0", length = 1)
    private boolean hasParking;

    @Column(name="pet_friendly", columnDefinition = "TINYINT UNSIGNED default 0", length = 1)
    private boolean petFriendly;

    @Column(name = "mall_id")
    private Long mallId;

    @Column(name = "is_inside_mall")
    private Boolean isMall;

    private String phones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", insertable = false, updatable = false)
    private CityModel cityModel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "enterprise_id", nullable = false, updatable = false, insertable = false)
    private EnterpriseV2 enterpriseV2;
}
