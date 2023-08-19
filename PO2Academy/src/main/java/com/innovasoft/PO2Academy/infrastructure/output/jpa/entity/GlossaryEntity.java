package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "glosario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlossaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word")
    private String word ;
    @Column(name = "definition")
    private String definition;

}
