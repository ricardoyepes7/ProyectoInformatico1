package com.innovasoft.PO2Academy.infrastructure.output.jpa.repository;

import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.ChallengeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IChallengeRepository extends JpaRepository<ChallengeEntity,Long> {
    Optional<ChallengeEntity> findByName(String name);
    @Query(value = " SELECT id FROM challenge " +
            " WHERE id=(SELECT id_challenge FROM questions " +
            " WHERE id=(SELECT id_question FROM answers " +
            " WHERE id= ?1)) ",nativeQuery = true)
    Long getChallengeIdByAnswerId(Long answerId);

    Optional<ChallengeEntity> findById(Long id);
}
