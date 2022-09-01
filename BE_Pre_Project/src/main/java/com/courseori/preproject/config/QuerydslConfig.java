package com.courseori.preproject.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/* Querydsl 사용을 위한 Config */

@Configuration
public class QuerydslConfig {

    @PersistenceContext
    private EntityManager em;

    /* jpaQueryFactory bean을 Repository에서 사용한다 */
    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(em);
    }


}
