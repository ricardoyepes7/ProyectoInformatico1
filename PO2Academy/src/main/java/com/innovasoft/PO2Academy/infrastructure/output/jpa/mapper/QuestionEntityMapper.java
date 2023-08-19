package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.Question;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.QuestionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface QuestionEntityMapper {
    Question toModel(QuestionEntity questionEntity);
}
