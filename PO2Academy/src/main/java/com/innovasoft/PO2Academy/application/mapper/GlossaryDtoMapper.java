package com.innovasoft.PO2Academy.application.mapper;

import com.innovasoft.PO2Academy.application.dto.GlossaryDto;
import com.innovasoft.PO2Academy.domain.model.Glossary;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface GlossaryDtoMapper {
    GlossaryDto toDto(Glossary glossary);
}
