package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    //쿼리문 작성 필요
//    @Query(value = "SELECT q FROM Question q WHERE c.coffeeId = :coffeeId")
    Optional<List<Question>> findFilteredQuestion(String filter, String sort);



}
