package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.Tutorial;
import com.innovasoft.PO2Academy.domain.spi.ITutorialPersistencePort;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.TutorialEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.ITutorialRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class TutorialJpaAdapter implements ITutorialPersistencePort {
    private final ITutorialRepository tutorialRepository;
    private final TutorialEntityMapper tutorialEntityMapper;
    @Override
    public List<Tutorial> getAllTutorials() {
        return tutorialRepository.findAll()
                .stream()
                .map(tutorialEntityMapper::toModel)
                .collect(Collectors.toList());
    }
}
