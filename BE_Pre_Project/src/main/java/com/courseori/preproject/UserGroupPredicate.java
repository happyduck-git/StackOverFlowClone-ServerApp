package com.courseori.preproject;

import com.courseori.preproject.question.entity.QQuestion;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public class UserGroupPredicate {

    public static Predicate search(String sort) {
        QQuestion question = QQuestion.question;

        BooleanBuilder builder = new BooleanBuilder();

        if(sort.equals("Highest score")) {

        } else if(sort.equals("Recent activity"))
        builder.and(question.views.eq())
    }
}
