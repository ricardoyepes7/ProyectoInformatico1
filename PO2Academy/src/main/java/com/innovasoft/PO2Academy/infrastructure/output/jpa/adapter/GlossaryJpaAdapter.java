package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.Glossary;
import com.innovasoft.PO2Academy.domain.spi.IGlossaryPersistencePort;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.GlossaryEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IGlossaryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class GlossaryJpaAdapter implements IGlossaryPersistencePort {
    private final IGlossaryRepository glossaryRepository;
    private final GlossaryEntityMapper glossaryEntityMapper;

    @Override
    public List<Glossary> getAllGlossaries() {
        return glossaryRepository.findAll()
                .stream()
                .map(glossaryEntityMapper::toModel)
                .collect(Collectors.toList());
    }
}
