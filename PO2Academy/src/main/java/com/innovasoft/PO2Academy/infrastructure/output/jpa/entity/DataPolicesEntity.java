package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "politica_de_datos")
public class DataPolicesEntity {
    @EmbeddedId
    private DataPolicesEntityPk id;
}
