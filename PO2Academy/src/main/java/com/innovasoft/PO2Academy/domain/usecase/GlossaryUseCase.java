package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IGlossaryServicePort;
import com.innovasoft.PO2Academy.domain.model.Glossary;
import com.innovasoft.PO2Academy.domain.spi.IGlossaryProviderPort;

import java.util.List;

public class GlossaryUseCase implements IGlossaryServicePort {
    private final IGlossaryProviderPort glossaryProviderPort;

    public GlossaryUseCase(IGlossaryProviderPort glossaryProviderPort) {
        this.glossaryProviderPort = glossaryProviderPort;
    }

    @Override
    public List<Glossary> getAllGlossaries() {
        return glossaryProviderPort.getAllGlossaries();
    }
}
