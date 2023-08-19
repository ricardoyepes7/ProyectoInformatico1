package com.innovasoft.PO2Academy.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeDto {
    private String name;
    private Map<String, Integer> scores;
    private int level;
    private boolean isAllComplete;
}
