package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.Glossary;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.GlossaryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface GlossaryEntityMapper {
    Glossary toModel(GlossaryEntity glossaryEntity);
}
