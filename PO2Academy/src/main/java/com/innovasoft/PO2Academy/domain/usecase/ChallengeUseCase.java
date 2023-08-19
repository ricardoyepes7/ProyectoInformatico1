package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IChallengeServicePort;
import com.innovasoft.PO2Academy.domain.model.Challenge;
import com.innovasoft.PO2Academy.domain.spi.IChallengePersistencePort;

import java.util.List;

public class ChallengeUseCase implements IChallengeServicePort {
    private final IChallengePersistencePort challengePersistencePort;

    public ChallengeUseCase(IChallengePersistencePort challengePersistencePort) {
        this.challengePersistencePort = challengePersistencePort;
    }

    @Override
    public Challenge getChallengeByName(String challengeName) {
        return challengePersistencePort.getChallengeByName(challengeName);
    }

    @Override
    public List<Challenge> getAllChallenges() {
        return challengePersistencePort.getAllChallenges();
    }

    @Override
    public Challenge getChallengeById(Long id) {
        return challengePersistencePort.getChallengeById(id);
    }

    @Override
    public Long getChallengeIdByAnswerId(Long answerId) {
        return challengePersistencePort.getChallengeIdByAnswerId(answerId);
    }
}
