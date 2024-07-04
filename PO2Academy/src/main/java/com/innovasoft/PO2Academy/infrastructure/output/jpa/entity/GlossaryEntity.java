package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "glosario")
public class GlossaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word")
    private String word ;
    @Column(name = "definition")
    private String definition;

}
