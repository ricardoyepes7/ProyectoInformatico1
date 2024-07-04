package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.ITutorialServicePort;
import com.innovasoft.PO2Academy.domain.model.Tutorial;
import com.innovasoft.PO2Academy.domain.spi.ITutorialProviderPort;

import java.util.List;

public class TutorialUseCase implements ITutorialServicePort {
    private final ITutorialProviderPort tutorialProviderPort;

    public TutorialUseCase(ITutorialProviderPort tutorialProviderPort) {
        this.tutorialProviderPort = tutorialProviderPort;
    }

    @Override
    public List<Tutorial> getAllTutorials() {
        return tutorialProviderPort.getAllTutorials();
    }
}
