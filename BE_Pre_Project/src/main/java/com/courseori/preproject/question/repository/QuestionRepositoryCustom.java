package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuestionRepositoryCustom {
    List<Question> findBySortUsingQuerydsl(String sort);
    Page<Question> findBySortUsingQuerydslPagination(String sort, Pageable pageable);
}
