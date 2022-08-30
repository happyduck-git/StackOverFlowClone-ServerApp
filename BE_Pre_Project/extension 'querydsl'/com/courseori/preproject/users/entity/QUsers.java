package com.courseori.preproject.users.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = 289851115L;

    public static final QUsers users = new QUsers("users");

    public final ListPath<com.courseori.preproject.answer.entity.Answer, com.courseori.preproject.answer.entity.QAnswer> answerList = this.<com.courseori.preproject.answer.entity.Answer, com.courseori.preproject.answer.entity.QAnswer>createList("answerList", com.courseori.preproject.answer.entity.Answer.class, com.courseori.preproject.answer.entity.QAnswer.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> joinedAt = createDateTime("joinedAt", java.time.LocalDateTime.class);

    public final StringPath password = createString("password");

    public final ListPath<com.courseori.preproject.question.entity.Question, com.courseori.preproject.question.entity.QQuestion> questionList = this.<com.courseori.preproject.question.entity.Question, com.courseori.preproject.question.entity.QQuestion>createList("questionList", com.courseori.preproject.question.entity.Question.class, com.courseori.preproject.question.entity.QQuestion.class, PathInits.DIRECT2);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath username = createString("username");

    public QUsers(String variable) {
        super(Users.class, forVariable(variable));
    }

    public QUsers(Path<? extends Users> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsers(PathMetadata metadata) {
        super(Users.class, metadata);
    }

}

