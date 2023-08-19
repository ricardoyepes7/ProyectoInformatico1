package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.Challenge;

import java.util.List;

public interface IChallengePersistencePort {
    Challenge getChallengeByName(String challengeName);
    List<Challenge> getAllChallenges();
    Challenge getChallengeById(Long id);
    Long getChallengeIdByAnswerId(Long answerId);
}
