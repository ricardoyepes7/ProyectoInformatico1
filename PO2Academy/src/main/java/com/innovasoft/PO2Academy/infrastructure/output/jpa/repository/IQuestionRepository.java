package com.innovasoft.PO2Academy.infrastructure.output.jpa.repository;

import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionRepository extends JpaRepository<QuestionEntity,Long> {
    List<QuestionEntity> findByChallengeIdAndLevel(Long idChallenge, int level);
}
