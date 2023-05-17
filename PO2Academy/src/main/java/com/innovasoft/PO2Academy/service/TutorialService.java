package com.innovasoft.PO2Academy.service;

import com.innovasoft.PO2Academy.entity.Tutorial;
import com.innovasoft.PO2Academy.repository.ChallengeRepository;
import com.innovasoft.PO2Academy.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TutorialService {
    @Autowired
    private TutorialRepository tutorialRepository;
    @Autowired
    private ChallengeRepository challengeRepository;

    public Map<String, List<String>> getTutorials() {
        return tutorialRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(tutorial -> challengeRepository.findById(tutorial.getIdChallenge()).get().getDescription(),
                        Collectors.mapping(Tutorial::getUrl, Collectors.toList())));
    }
}
