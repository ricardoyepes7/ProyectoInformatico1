package com.innovasoft.PO2Academy.infrastructure.output.jpa.repository;

import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAnswerRepository extends JpaRepository<AnswerEntity,Long> {
    List<AnswerEntity> findByQuestionId(Long questionId);

    @Query(value = "SELECT correct_answer FROM answers WHERE id =?1 ", nativeQuery = true)
    boolean isCorrect(Long id);
}
