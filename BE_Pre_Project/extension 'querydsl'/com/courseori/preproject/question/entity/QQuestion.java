package com.courseori.preproject.question.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuestion is a Querydsl query type for Question
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestion extends EntityPathBase<Question> {

    private static final long serialVersionUID = 784413265L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuestion question = new QQuestion("question");

    public final ListPath<com.courseori.preproject.answer.entity.Answer, com.courseori.preproject.answer.entity.QAnswer> answerList = this.<com.courseori.preproject.answer.entity.Answer, com.courseori.preproject.answer.entity.QAnswer>createList("answerList", com.courseori.preproject.answer.entity.Answer.class, com.courseori.preproject.answer.entity.QAnswer.class, PathInits.DIRECT2);

    public final StringPath body = createString("body");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> modifiedAt = createDateTime("modifiedAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> questionId = createNumber("questionId", Long.class);

    public final ListPath<String, StringPath> tagList = this.<String, StringPath>createList("tagList", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final com.courseori.preproject.users.entity.QUsers users;

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public final NumberPath<Integer> votes = createNumber("votes", Integer.class);

    public QQuestion(String variable) {
        this(Question.class, forVariable(variable), INITS);
    }

    public QQuestion(Path<? extends Question> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestion(PathMetadata metadata, PathInits inits) {
        this(Question.class, metadata, inits);
    }

    public QQuestion(Class<? extends Question> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.users = inits.isInitialized("users") ? new com.courseori.preproject.users.entity.QUsers(forProperty("users")) : null;
    }

}

