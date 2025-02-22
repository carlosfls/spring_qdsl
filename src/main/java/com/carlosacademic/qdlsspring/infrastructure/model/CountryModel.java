package com.carlosacademic.qdlsspring.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "country")
public class CountryModel extends AbstractBaseAuditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "countryModel", fetch = FetchType.LAZY)
    private List<CityModel> listCity;

    @PrePersist
    public void prePersist(){
        this.createdAt = new Date(System.currentTimeMillis());
        this.uuid = UUID.randomUUID().toString();
        this.setIsActive(true);
    }
}
