package com.innovasoft.PO2Academy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "glosario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Glossary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word")
    private String termino ;
    @Column(name = "definition")
    private String definicion;

}
