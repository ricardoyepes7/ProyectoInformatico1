package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.Result;
import com.innovasoft.PO2Academy.domain.spi.IResultPersistencePort;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.ResultEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IResultRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ResultJpaAdapter implements IResultPersistencePort {
    private final IResultRepository resultRepository;
    private final ResultEntityMapper resultEntityMapper;
    @Override
    public void saveResult(Result result) {
        resultRepository.save(resultEntityMapper.toEntity(result));
    }

    @Override
    public int getMaxChallenge(String username, Long challengeId) {
        return resultRepository.getMaxChallenge(username, challengeId);
    }
}
