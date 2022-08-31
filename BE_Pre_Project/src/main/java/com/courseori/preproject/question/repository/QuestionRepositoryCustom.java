package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.Question;

import java.util.List;

public interface QuestionRepositoryCustom {
    List<Question> findSortedQuestions(String sort);
}
