package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.DataPolices;

import java.util.List;

public interface IDataPolicesProviderPort {
    List<DataPolices> getDataPoliciesByUsernameFromLast30Days(String username);
    void saveDataPolice(DataPolices dataPolices);

}
