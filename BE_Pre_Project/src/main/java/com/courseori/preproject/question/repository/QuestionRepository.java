package com.courseori.preproject.question.repository;

import com.courseori.preproject.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>, QuerydslPredicateExecutor<Question>, QuestionRepositoryCustom {

    //쿼리문 작성 필요
//    @Query(value = "SELECT q FROM Question q WHERE c.coffeeId = :coffeeId")
//    Optional<List<Question>> findFilteredQuestion(String filter, String sort);


    /*
    @Override
public List<Catalog> findRootSubCatalogs(String nameContains, String searchDateBy, DateTime from, DateTime to) {
 QCatalog qCatalog = QCatalog.catalog;
 JPQLQuery query = from(qCatalog)
   .where(qCatalog.parentId.isNull())
   .where(CatalogPredicate.searchList(nameContains, searchDateBy, from, to))
   .orderBy(qCatalog.name.asc());
 return query.fetch();
}
     */



}
