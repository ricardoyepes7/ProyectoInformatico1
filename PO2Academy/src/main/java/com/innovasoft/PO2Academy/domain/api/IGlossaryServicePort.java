package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.Glossary;

import java.util.List;

public interface IGlossaryServicePort {
    List<Glossary> getAllGlossaries();
}
