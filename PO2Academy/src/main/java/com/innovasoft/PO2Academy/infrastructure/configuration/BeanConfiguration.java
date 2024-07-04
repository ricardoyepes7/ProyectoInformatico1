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
    public IUserServicePort userServicePort(IUserProviderPort userProviderPort) {
        return new UserUseCase(userProviderPort);
    }

    @Bean
    public IUserProviderPort userProviderPort(IUserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IResultServicePort resultServicePort(IResultProviderPort resultProviderPort) {
        return new ResultUseCase(resultProviderPort);
    }

    @Bean
    public IResultProviderPort resultProviderPort(IResultRepository resultRepository, ResultEntityMapper resultEntityMapper) {
        return new ResultJpaAdapter(resultRepository, resultEntityMapper);
    }

    @Bean
    public IChallengeServicePort challengeServicePort(IChallengeProviderPort challengeProviderPort) {
        return new ChallengeUseCase(challengeProviderPort);
    }

    @Bean
    public IChallengeProviderPort challengeProviderPort(IChallengeRepository challengeRepository,
                                                           ChallengeEntityMapper challengeEntityMapper) {
        return new ChallengeJpaAdapter(challengeRepository, challengeEntityMapper);
    }

    @Bean
    public ITutorialServicePort tutorialServicePort(ITutorialProviderPort tutorialProviderPort) {
        return new TutorialUseCase(tutorialProviderPort);
    }

    @Bean
    public ITutorialProviderPort tutorialProviderPort(ITutorialRepository tutorialRepository,
                                                         TutorialEntityMapper tutorialEntityMapper) {
        return new TutorialJpaAdapter(tutorialRepository, tutorialEntityMapper);
    }

    @Bean
    public IGlossaryServicePort glossaryServicePort(IGlossaryProviderPort glossaryProviderPort) {
        return new GlossaryUseCase(glossaryProviderPort);
    }

    @Bean
    public IGlossaryProviderPort glossaryProviderPort(IGlossaryRepository glossaryRepository,
                                                         GlossaryEntityMapper glossaryEntityMapper) {
        return new GlossaryJpaAdapter(glossaryRepository, glossaryEntityMapper);
    }

    @Bean
    public IQuestionServicePort questionServicePort(IQuestionProviderPort questionProviderPort) {
        return new QuestionUseCase(questionProviderPort);
    }

    @Bean
    public IQuestionProviderPort questionProviderPort(IQuestionRepository questionRepository,
                                                         QuestionEntityMapper questionEntityMapper) {
        return new QuestionJpaAdapter(questionRepository, questionEntityMapper);
    }

    @Bean
    public IAnswerServicePort answerServicePort(IAnswerProviderPort answerProviderPort) {
        return new AnswerUseCase(answerProviderPort);
    }

    @Bean
    public IAnswerProviderPort answerProviderPort(IAnswerRepository answerRepository,
                                                     AnswerEntityMapper answerEntityMapper) {
        return new AnswerJpaAdapter(answerRepository, answerEntityMapper);
    }
    @Bean
    public IDataPolicesServicePort dataPolicesServicePort(IDataPolicesProviderPort dataPolicesProviderPort){
        return new DataPolicesUseCase(dataPolicesProviderPort);
    }
    @Bean
    public IDataPolicesProviderPort dataPolicesProviderPort(IDataPolicesRepository dataPolicesRepository,
                                                               DataPolicesEntityMapper dataPolicesEntityMapper){
        return new DataPolicesJpaAdapter(dataPolicesRepository,dataPolicesEntityMapper);
    }
}
