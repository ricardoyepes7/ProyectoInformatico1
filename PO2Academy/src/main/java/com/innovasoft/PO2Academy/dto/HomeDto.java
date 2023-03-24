package com.innovasoft.PO2Academy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeDto {
    private String name;
    private int encapsulationScore;
    private int abstractionScore;
    private int inheritanceScore;
    private int polymorphismScore;
}
