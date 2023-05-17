package com.innovasoft.PO2Academy.service;

import com.innovasoft.PO2Academy.dto.HomeDto;
import com.innovasoft.PO2Academy.entity.Challenge;
import com.innovasoft.PO2Academy.entity.User;
import com.innovasoft.PO2Academy.repository.ChallengeRepository;
import com.innovasoft.PO2Academy.repository.ResultRepository;
import com.innovasoft.PO2Academy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HomeService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ResultRepository resultRepository;
    @Autowired
    private ChallengeRepository challengeRepository;

    public HomeDto getUserData(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow();
        Map<String, Integer> scores = challengeRepository.findAll().stream()
                .collect(Collectors.toMap(Challenge::getDescription,
                        challenge -> resultRepository.getMaxChallenge(username, challenge.getId())));
        return new HomeDto(user.getName(), scores, user.getLevel(),
                scores.entrySet().stream().allMatch(score -> score.getValue() == 100));
    }
}
