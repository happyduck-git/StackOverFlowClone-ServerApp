package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.QQuestion;
import com.courseori.preproject.question.entity.Question;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class QuestionRepositoryImpl extends QuerydslRepositorySupport implements QuestionRepositoryCustom {


    public QuestionRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(Question.class);
    }

    @Override
    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }

    @Override
    public List<Question> findSortedQuestions(String sort) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(this.getEntityManager());
        QQuestion question = QQuestion.question;

        return queryFactory.selectFrom(question).orderBy(question.views.asc()).fetch();
    }
}
