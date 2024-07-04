package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "challenge")
public class ChallengeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
