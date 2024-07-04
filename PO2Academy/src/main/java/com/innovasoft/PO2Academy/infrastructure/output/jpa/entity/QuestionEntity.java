package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "questions")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "question")
    private String question;
    @Column(name = "id_challenge ")
    private Long challengeId ;
    @Column(name = "level ")
    private Integer level;
}
