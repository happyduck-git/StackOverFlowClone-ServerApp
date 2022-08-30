package com.courseori.preproject.answer.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnswer is a Querydsl query type for Answer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnswer extends EntityPathBase<Answer> {

    private static final long serialVersionUID = -1907472191L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnswer answer = new QAnswer("answer");

    public final NumberPath<Long> answerId = createNumber("answerId", Long.class);

    public final StringPath body = createString("body");

    public final ListPath<String, StringPath> commentList = this.<String, StringPath>createList("commentList", String.class, StringPath.class, PathInits.DIRECT2);

    public final com.courseori.preproject.question.entity.QQuestion question;

    public final com.courseori.preproject.users.entity.QUsers users;

    public final NumberPath<Integer> votes = createNumber("votes", Integer.class);

    public QAnswer(String variable) {
        this(Answer.class, forVariable(variable), INITS);
    }

    public QAnswer(Path<? extends Answer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnswer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnswer(PathMetadata metadata, PathInits inits) {
        this(Answer.class, metadata, inits);
    }

    public QAnswer(Class<? extends Answer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.question = inits.isInitialized("question") ? new com.courseori.preproject.question.entity.QQuestion(forProperty("question"), inits.get("question")) : null;
        this.users = inits.isInitialized("users") ? new com.courseori.preproject.users.entity.QUsers(forProperty("users")) : null;
    }

}

