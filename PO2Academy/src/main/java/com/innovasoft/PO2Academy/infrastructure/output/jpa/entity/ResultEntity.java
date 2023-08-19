package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "challenge_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "id_challenge")
    private Long challengeId;
    @Column(name = "score")
    private Integer score;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "level")
    private Integer level;

}
