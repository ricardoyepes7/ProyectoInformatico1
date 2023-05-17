package com.innovasoft.PO2Academy.repository;

import com.innovasoft.PO2Academy.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result,Long> {
    @Query(value = " SELECT IFNULL(MAX(`score`),0) FROM `challenge_results`  " +
            " WHERE `username` =  ?1" +
            " AND `id_challenge` = ?2 " +
            " AND `level`=(SELECT `level`FROM `users`WHERE `username`= ?1) ",nativeQuery = true)
    int getMaxChallenge(String username,Long challengeId);


}
