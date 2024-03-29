package com.innovasoft.PO2Academy.infrastructure.output.jpa.repository;

import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.ResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IResultRepository extends JpaRepository<ResultEntity,Long> {
    @Query(value = " SELECT IFNULL(MAX(`score`),0) FROM `challenge_results`  " +
            " WHERE `username` =  ?1" +
            " AND `id_challenge` = ?2 " +
            " AND `level`=(SELECT `level`FROM `users`WHERE `username`= ?1) ",nativeQuery = true)
    int getMaxChallenge(String username,Long challengeId);


}
