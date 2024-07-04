package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "tutorials")
public class TutorialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_challenge")
    private Long challengeId;

    @Column(name = "url_video")
    private String url;

}
