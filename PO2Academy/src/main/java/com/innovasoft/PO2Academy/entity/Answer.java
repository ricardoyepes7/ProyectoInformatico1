package com.innovasoft.PO2Academy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "answers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "option_answer")
    private String optionAnswer;
    @Column(name = "id_question")
    private Long idQuestion;

    @Column(name = "correct_answer")
    private Boolean isCorrect;

}
