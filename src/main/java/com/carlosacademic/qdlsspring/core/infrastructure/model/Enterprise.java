package com.carlosacademic.qdlsspring.core.infrastructure.model;

import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "identification_number")
    private String identificationNumber;

    @Column(name = "business_name")
    private String businessName;

    private String web;

    private String img;

    @Column(name = "country_id")
    private long countryId;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column (name= "business_code")
    private String businessCode;

    @Column(name = "description")
    private String description;

    @Column(name = "email")
    private String email ;

    @Column(name = "web_link")
    private String webLink ;

    @Column(name = "logo")
    private String logo ;

    @Column(name = "schedule")
    private Boolean schedule ;

    @Column(name = "reason")
    private String reason;

    private String phones;

    @Enumerated(EnumType.STRING)
    private Typology typology;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;

    @OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
    private List<Establishment> establishments;
}