package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IGlossaryServicePort;
import com.innovasoft.PO2Academy.domain.model.Glossary;
import com.innovasoft.PO2Academy.domain.spi.IGlossaryPersistencePort;

import java.util.List;

public class GlossaryUseCase implements IGlossaryServicePort {
    private final IGlossaryPersistencePort glossaryPersistencePort;

    public GlossaryUseCase(IGlossaryPersistencePort glossaryPersistencePort) {
        this.glossaryPersistencePort = glossaryPersistencePort;
    }

    @Override
    public List<Glossary> getAllGlossaries() {
        return glossaryPersistencePort.getAllGlossaries();
    }
}
