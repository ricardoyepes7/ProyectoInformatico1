package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.ITutorialServicePort;
import com.innovasoft.PO2Academy.domain.model.Tutorial;
import com.innovasoft.PO2Academy.domain.spi.ITutorialPersistencePort;

import java.util.List;

public class TutorialUseCase implements ITutorialServicePort {
    private final ITutorialPersistencePort tutorialPersistencePort;

    public TutorialUseCase(ITutorialPersistencePort tutorialPersistencePort) {
        this.tutorialPersistencePort = tutorialPersistencePort;
    }

    @Override
    public List<Tutorial> getAllTutorials() {
        return tutorialPersistencePort.getAllTutorials();
    }
}
