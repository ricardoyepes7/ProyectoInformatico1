package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.Result;


public interface IResultServicePort {
    void saveResult(Result result);
    int getMaxChallenge(String username,Long challengeId);
}
