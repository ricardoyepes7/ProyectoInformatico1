package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.Tutorial;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.TutorialEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TutorialEntityMapper {
    Tutorial toModel(TutorialEntity tutorialEntity);
}
