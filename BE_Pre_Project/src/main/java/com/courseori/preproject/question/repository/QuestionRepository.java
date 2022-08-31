package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>, QuerydslPredicateExecutor<Question> {

    //쿼리문 작성 필요
//    @Query(value = "SELECT q FROM Question q WHERE c.coffeeId = :coffeeId")
//    Optional<List<Question>> findFilteredQuestion(String filter, String sort);



}
