package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IDataPolicesServicePort;
import com.innovasoft.PO2Academy.domain.model.DataPolices;
import com.innovasoft.PO2Academy.domain.spi.IDataPolicesProviderPort;

import java.util.List;

public class DataPolicesUseCase implements IDataPolicesServicePort {
    private final IDataPolicesProviderPort dataPolicesProviderPort;

    public DataPolicesUseCase(IDataPolicesProviderPort dataPolicesProviderPort) {
        this.dataPolicesProviderPort = dataPolicesProviderPort;
    }

    @Override
    public List<DataPolices> getDataPoliciesByUsernameFromLast30Days(String username) {
        return dataPolicesProviderPort.getDataPoliciesByUsernameFromLast30Days(username);
    }

    @Override
    public void saveDataPolice(DataPolices dataPolices) {
        dataPolicesProviderPort.saveDataPolice(dataPolices);
    }
}
