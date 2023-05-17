package com.innovasoft.PO2Academy.repository;

import com.innovasoft.PO2Academy.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
    List<Answer> findByIdQuestion(Long idQuestion);

    @Query(value = "SELECT correct_answer FROM answers WHERE id =?1 ", nativeQuery = true)
    boolean isCorrect(Long id);
}
