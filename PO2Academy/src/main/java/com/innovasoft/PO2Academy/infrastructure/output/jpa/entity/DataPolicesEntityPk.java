package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class DataPolicesEntityPk implements Serializable {
    @Column(name = "username")
    private String username;
    @Column(name = "fecha")
    private LocalDateTime date;

}
