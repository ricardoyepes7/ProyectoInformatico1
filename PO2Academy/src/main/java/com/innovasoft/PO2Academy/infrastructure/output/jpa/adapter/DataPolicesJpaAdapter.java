package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.DataPolices;
import com.innovasoft.PO2Academy.domain.spi.IDataPolicesProviderPort;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.DataPolicesEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IDataPolicesRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DataPolicesJpaAdapter implements IDataPolicesProviderPort {
    private final IDataPolicesRepository dataPolicesRepository;
    public final DataPolicesEntityMapper dataPolicesEntityMapper;

    @Override
    public List<DataPolices> getDataPoliciesByUsernameFromLast30Days(String username) {
        return dataPolicesRepository.findByUsernameAndFechaBetween(username, LocalDateTime.now().minusDays(30), LocalDateTime.now())
                .stream()
                .map(dataPolicesEntityMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public void saveDataPolice(DataPolices dataPolices) {
        dataPolicesRepository.save(dataPolicesEntityMapper.toEntity(dataPolices));
    }
}
