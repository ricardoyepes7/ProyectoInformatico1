package com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper;

import com.innovasoft.PO2Academy.domain.model.Result;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.ResultEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ResultEntityMapper {
    Result toModel(ResultEntity resultEntity);
    ResultEntity toEntity(Result result);
}
