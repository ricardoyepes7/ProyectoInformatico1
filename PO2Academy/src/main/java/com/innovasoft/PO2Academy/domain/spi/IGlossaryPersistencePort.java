package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.Glossary;

import java.util.List;

public interface IGlossaryPersistencePort {
    List<Glossary> getAllGlossaries();
}
