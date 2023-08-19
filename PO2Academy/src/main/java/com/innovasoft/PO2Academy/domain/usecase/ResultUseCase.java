package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IResultServicePort;
import com.innovasoft.PO2Academy.domain.model.Result;
import com.innovasoft.PO2Academy.domain.spi.IResultPersistencePort;


public class ResultUseCase implements IResultServicePort {
    private final IResultPersistencePort resultPersistencePort;

    public ResultUseCase(IResultPersistencePort resultPersistencePort) {
        this.resultPersistencePort = resultPersistencePort;
    }

    @Override
    public void saveResult(Result result) {
        resultPersistencePort.saveResult(result);
    }

    @Override
    public int getMaxChallenge(String username, Long challengeId) {
        return resultPersistencePort.getMaxChallenge(username, challengeId);
    }
}
