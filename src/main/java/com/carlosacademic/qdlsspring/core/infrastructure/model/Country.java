package com.carlosacademic.qdlsspring.core.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<City> listCity;
}
