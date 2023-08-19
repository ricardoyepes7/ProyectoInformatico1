package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.Challenge;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.ChallengeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ChallengeEntityMapper {
    Challenge toModel(ChallengeEntity challengeEntity);
}
