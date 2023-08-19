package com.innovasoft.PO2Academy.infrastructure.configuration;

import com.innovasoft.PO2Academy.domain.api.*;
import com.innovasoft.PO2Academy.domain.spi.*;
import com.innovasoft.PO2Academy.domain.usecase.*;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter.*;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.*;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfiguration {
    @Bean
    public IUserServicePort userServicePort(IUserPersistencePort userPersistencePort) {
        return new UserUseCase(userPersistencePort);
    }

    @Bean
    public IUserPersistencePort userPersistencePort(IUserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IResultServicePort resultServicePort(IResultPersistencePort resultPersistencePort) {
        return new ResultUseCase(resultPersistencePort);
    }

    @Bean
    public IResultPersistencePort resultPersistencePort(IResultRepository resultRepository, ResultEntityMapper resultEntityMapper) {
        return new ResultJpaAdapter(resultRepository, resultEntityMapper);
    }

    @Bean
    public IChallengeServicePort challengeServicePort(IChallengePersistencePort challengePersistencePort) {
        return new ChallengeUseCase(challengePersistencePort);
    }

    @Bean
    public IChallengePersistencePort challengePersistencePort(IChallengeRepository challengeRepository,
                                                              ChallengeEntityMapper challengeEntityMapper) {
        return new ChallengeJpaAdapter(challengeRepository, challengeEntityMapper);
    }

    @Bean
    public ITutorialServicePort tutorialServicePort(ITutorialPersistencePort tutorialPersistencePort) {
        return new TutorialUseCase(tutorialPersistencePort);
    }

    @Bean
    public ITutorialPersistencePort tutorialPersistencePort(ITutorialRepository tutorialRepository,
                                                            TutorialEntityMapper tutorialEntityMapper) {
        return new TutorialJpaAdapter(tutorialRepository, tutorialEntityMapper);
    }

    @Bean
    public IGlossaryServicePort glossaryServicePort(IGlossaryPersistencePort glossaryPersistencePort) {
        return new GlossaryUseCase(glossaryPersistencePort);
    }

    @Bean
    public IGlossaryPersistencePort glossaryPersistencePort(IGlossaryRepository glossaryRepository,
                                                            GlossaryEntityMapper glossaryEntityMapper) {
        return new GlossaryJpaAdapter(glossaryRepository, glossaryEntityMapper);
    }

    @Bean
    public IQuestionServicePort questionServicePort(IQuestionPersistencePort questionPersistencePort) {
        return new QuestionUseCase(questionPersistencePort);
    }

    @Bean
    public IQuestionPersistencePort questionPersistencePort(IQuestionRepository questionRepository,
                                                            QuestionEntityMapper questionEntityMapper) {
        return new QuestionJpaAdapter(questionRepository, questionEntityMapper);
    }

    @Bean
    public IAnswerServicePort answerServicePort(IAnswerPersistencePort answerPersistencePort) {
        return new AnswerUseCase(answerPersistencePort);
    }

    @Bean
    public IAnswerPersistencePort answerPersistencePort(IAnswerRepository answerRepository,
                                                        AnswerEntityMapper answerEntityMapper) {
        return new AnswerJpaAdapter(answerRepository, answerEntityMapper);
    }
}
