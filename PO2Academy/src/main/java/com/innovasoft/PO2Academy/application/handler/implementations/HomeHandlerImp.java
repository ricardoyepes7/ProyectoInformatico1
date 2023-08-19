package com.innovasoft.PO2Academy.application.handler.implementations;

import com.innovasoft.PO2Academy.application.dto.HomeDto;
import com.innovasoft.PO2Academy.application.handler.interfaces.IHomeHandler;
import com.innovasoft.PO2Academy.domain.api.IChallengeServicePort;
import com.innovasoft.PO2Academy.domain.api.IResultServicePort;
import com.innovasoft.PO2Academy.domain.model.Challenge;
import com.innovasoft.PO2Academy.domain.model.User;
import com.innovasoft.PO2Academy.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HomeHandlerImp implements IHomeHandler {
    private final IUserPersistencePort userPersistencePort;
    private final IResultServicePort resultServicePort;
    private final IChallengeServicePort challengeServicePort;

    @Override
    public HomeDto getUserData(String username) {
        User user = userPersistencePort.getUserByUsername(username);
        Map<String, Integer> scores = challengeServicePort.getAllChallenges().stream()
                .collect(Collectors.toMap(Challenge::getDescription,
                        challengeEntity -> resultServicePort.getMaxChallenge(username, challengeEntity.getId())));
        return new HomeDto(user.getName(), scores, user.getLevel(),
                scores.entrySet().stream().allMatch(score -> score.getValue() == 100));
    }
}
