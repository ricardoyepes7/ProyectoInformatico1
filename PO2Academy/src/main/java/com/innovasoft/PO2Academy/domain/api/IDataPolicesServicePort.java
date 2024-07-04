package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.DataPolices;

import java.util.List;

public interface IDataPolicesServicePort {
    List<DataPolices> getDataPoliciesByUsernameFromLast30Days(String username);
    void saveDataPolice(DataPolices dataPolices);
}
