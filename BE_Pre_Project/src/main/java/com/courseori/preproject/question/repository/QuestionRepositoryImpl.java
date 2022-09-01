package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.QQuestion;
import com.courseori.preproject.question.entity.Question;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepositoryImpl implements QuestionRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public QuestionRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    QQuestion question = QQuestion.question;

    @Override
    public List<Question> findBySortUsingQuerydsl(String sort) {

        List<Question> questions;

        if(sort.equals("HighestScore")) {

            questions = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.votes.desc())
                    .offset(1)
                    .limit(3)
                    .fetch();
            return questions;

        } else {

            questions = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.createdAt.desc())
                    .offset(1)
                    .limit(3)
                    .fetch();
            return questions;
        }

    }


    @Override
    public Page<Question> findBySortUsingQuerydslPagination(String sort, Pageable pageable) {
        List<Question> questions;
        JPAQuery<Question> query;


        if (sort.equals("HighestScore")) {

            questions = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.votes.desc())
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .fetch();

            query = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.votes.desc());
            return PageableExecutionUtils.getPage(questions, pageable, query::fetchCount);

        } else if (sort.equals("MostFrequent")) {

            questions = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.views.desc())
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .fetch();

            query = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.views.desc());

            return PageableExecutionUtils.getPage(questions, pageable, query::fetchCount);

        } else {

            questions = jpaQueryFactory.selectFrom(question)
                    .orderBy(question.createdAt.desc())
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .fetch();

            query =  jpaQueryFactory.selectFrom(question)
                    .orderBy(question.createdAt.desc());

            return PageableExecutionUtils.getPage(questions, pageable, query::fetchCount);
        }
    }

}
