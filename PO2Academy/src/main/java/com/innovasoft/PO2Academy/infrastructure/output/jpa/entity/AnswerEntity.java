package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "answers")
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "option_answer")
    private String optionAnswer;
    @Column(name = "id_question")
    private Long questionId;
    @Column(name = "correct_answer")
    private Boolean isCorrect;

}
