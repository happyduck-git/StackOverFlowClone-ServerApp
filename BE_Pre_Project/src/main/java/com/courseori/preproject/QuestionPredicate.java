package com.courseori.preproject;

import com.courseori.preproject.question.entity.QQuestion;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Configuration
public class QuestionPredicate {

    private static EntityManager em;

    @Bean
    public EntityManager manager(EntityManagerFactory emf) {

        em = emf.createEntityManager();

        return em;
    }


    public static Predicate search(String sort) {

        QQuestion question = QQuestion.question;
        JPAQueryFactory query = new JPAQueryFactory(em);

        BooleanBuilder builder = new BooleanBuilder();

        if(sort.equals("HighestScore")) {

           builder.and(query.selectFrom(question).orderBy(question.votes.asc()).getMetadata().getHaving());

        } else if(sort.equals("RecentActivity")){
            builder.and(query.selectFrom(question).orderBy(question.createdAt.asc()).getMetadata().getWhere());
        }
        return builder;
    }
}
