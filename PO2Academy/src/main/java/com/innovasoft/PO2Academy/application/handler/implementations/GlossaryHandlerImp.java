package com.innovasoft.PO2Academy.application.handler.implementations;

import com.innovasoft.PO2Academy.application.dto.GlossaryDto;
import com.innovasoft.PO2Academy.application.handler.interfaces.IGlossaryHandler;
import com.innovasoft.PO2Academy.application.mapper.GlossaryDtoMapper;
import com.innovasoft.PO2Academy.domain.api.IGlossaryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GlossaryHandlerImp implements IGlossaryHandler {
    private final IGlossaryServicePort glossaryServicePort;
    private final GlossaryDtoMapper glossaryDtoMapper;
    @Override
    public List<GlossaryDto> getAllGlossaries() {
        return glossaryServicePort.getAllGlossaries()
                .stream()
                .map(glossaryDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
