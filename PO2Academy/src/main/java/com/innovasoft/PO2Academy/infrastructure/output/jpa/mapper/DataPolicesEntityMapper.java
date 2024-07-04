package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.DataPolices;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.DataPolicesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface DataPolicesEntityMapper {
    @Mapping(target = "username", source = "id.username")
    @Mapping(target = "date", source = "id.date")
    DataPolices toModel(DataPolicesEntity dataPolicesEntity);
    @Mapping(source = "username", target = "id.username")
    @Mapping(source = "date", target = "id.date")
    DataPolicesEntity toEntity(DataPolices dataPolices);
}
