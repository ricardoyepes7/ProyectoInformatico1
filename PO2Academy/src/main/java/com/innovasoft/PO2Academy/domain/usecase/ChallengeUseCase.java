package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IChallengeServicePort;
import com.innovasoft.PO2Academy.domain.model.Challenge;
import com.innovasoft.PO2Academy.domain.spi.IChallengeProviderPort;

import java.util.List;

public class ChallengeUseCase implements IChallengeServicePort {
    private final IChallengeProviderPort challengeProviderPort;

    public ChallengeUseCase(IChallengeProviderPort challengeProviderPort) {
        this.challengeProviderPort = challengeProviderPort;
    }

    @Override
    public Challenge getChallengeByName(String challengeName) {
        return challengeProviderPort.getChallengeByName(challengeName);
    }

    @Override
    public List<Challenge> getAllChallenges() {
        return challengeProviderPort.getAllChallenges();
    }

    @Override
    public Challenge getChallengeById(Long id) {
        return challengeProviderPort.getChallengeById(id);
    }

    @Override
    public Long getChallengeIdByAnswerId(Long answerId) {
        return challengeProviderPort.getChallengeIdByAnswerId(answerId);
    }
}
