package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.Result;

public interface IResultPersistencePort {
    void saveResult(Result result);
    int getMaxChallenge(String username,Long challengeId);
}
