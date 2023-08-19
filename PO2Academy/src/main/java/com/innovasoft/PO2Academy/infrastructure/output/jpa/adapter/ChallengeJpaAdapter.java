package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.Challenge;
import com.innovasoft.PO2Academy.domain.spi.IChallengePersistencePort;
import com.innovasoft.PO2Academy.application.exception.ChallengeException;
import com.innovasoft.PO2Academy.infrastructure.exception.JpaException;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.ChallengeEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IChallengeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ChallengeJpaAdapter implements IChallengePersistencePort {
    private final IChallengeRepository challengeRepository;
    private final ChallengeEntityMapper challengeEntityMapper;

    @Override
    public Challenge getChallengeByName(String challengeName) {
        return challengeRepository.findByName(challengeName)
                .map(challengeEntityMapper::toModel)
                .orElseThrow(()->new ChallengeException("Desafio "+ challengeName +" no existe."));
    }

    @Override
    public List<Challenge> getAllChallenges() {
        return challengeRepository.findAll()
                .stream()
                .map(challengeEntityMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public Challenge getChallengeById(Long id) {
        return challengeRepository.findById(id)
                .map(challengeEntityMapper::toModel)
                .orElseThrow(()->new JpaException("Reto con id: "+id+" no encontrado."));
    }

    @Override
    public Long getChallengeIdByAnswerId(Long answerId) {
        return challengeRepository.getChallengeIdByAnswerId(answerId);
    }
}
