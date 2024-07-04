package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.Tutorial;

import java.util.List;

public interface ITutorialProviderPort {
    List<Tutorial> getAllTutorials();

}
