package com.innovasoft.PO2Academy.application.handler.implementations;

import com.innovasoft.PO2Academy.application.handler.interfaces.ITutorialHandler;
import com.innovasoft.PO2Academy.domain.api.IChallengeServicePort;
import com.innovasoft.PO2Academy.domain.api.ITutorialServicePort;
import com.innovasoft.PO2Academy.domain.model.Tutorial;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TutorialHandlerImp implements ITutorialHandler {
    private final ITutorialServicePort tutorialServicePort;
    private final IChallengeServicePort challengeServicePort;

    @Override
    public Map<String, List<String>> getTutorials() {
        return tutorialServicePort.getAllTutorials()
                .stream()
                .collect(Collectors.groupingBy(tutorial -> challengeServicePort.getChallengeById(tutorial.getChallengeId()).getDescription(),
                        Collectors.mapping(Tutorial::getUrl, Collectors.toList())));
    }
}
