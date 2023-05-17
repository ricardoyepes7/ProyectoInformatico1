package com.innovasoft.PO2Academy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "question")
    private String question;
    @Column(name = "id_challenge ")
    private Long idChallenge ;
    @Column(name = "level ")
    private Integer level;


   /* @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_challenge")
    private Challenge challenge ;*/
}
