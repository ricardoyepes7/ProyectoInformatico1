package com.innovasoft.PO2Academy.application.handler.implementations;

import com.innovasoft.PO2Academy.application.handler.interfaces.IDataPoliciesHandler;
import com.innovasoft.PO2Academy.domain.api.IDataPolicesServicePort;
import com.innovasoft.PO2Academy.domain.model.DataPolices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DataPoliciesHandlerImp implements IDataPoliciesHandler {
    private final IDataPolicesServicePort dataPolicesServicePort;
    @Override
    @Transactional
    public void saveDataPolice(String username) {
        dataPolicesServicePort.saveDataPolice(new DataPolices(username, LocalDateTime.now()));
    }
}
