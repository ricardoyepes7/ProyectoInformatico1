package com.innovasoft.PO2Academy.repository;

import com.innovasoft.PO2Academy.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge,Long> {
    Optional<Challenge> findByName(String name);
    @Query(value = " SELECT id FROM challenge " +
            " WHERE id=(SELECT id_challenge FROM questions " +
            " WHERE id=(SELECT id_question FROM answers " +
            " WHERE id= ?1)) ",nativeQuery = true)
    Long getChallengeIdByAnswerId(Long answerId);

    Optional<Challenge> findById(Long id);
}
