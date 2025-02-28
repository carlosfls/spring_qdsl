package com.carlosacademic.qdlsspring.commons.config;

import com.querydsl.jpa.JPQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {

    @PersistenceContext
    private final EntityManager entityManager;

    public DataBaseConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Bean
    public JPAQueryFactory entityManager(){
        return new JPAQueryFactory(JPQLTemplates.DEFAULT, entityManager);
    }
}
