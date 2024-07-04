package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IResultServicePort;
import com.innovasoft.PO2Academy.domain.model.Result;
import com.innovasoft.PO2Academy.domain.spi.IResultProviderPort;


public class ResultUseCase implements IResultServicePort {
    private final IResultProviderPort resultProviderPort;

    public ResultUseCase(IResultProviderPort resultProviderPort) {
        this.resultProviderPort = resultProviderPort;
    }

    @Override
    public void saveResult(Result result) {
        resultProviderPort.saveResult(result);
    }

    @Override
    public int getMaxChallenge(String username, Long challengeId) {
        return resultProviderPort.getMaxChallenge(username, challengeId);
    }
}
