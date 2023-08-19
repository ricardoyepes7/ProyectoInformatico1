package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.Answer;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.AnswerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AnswerEntityMapper {
    Answer toModel(AnswerEntity answerEntity);
}
