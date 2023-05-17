package com.innovasoft.PO2Academy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tutorials")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "id_challenge")
    private Long idChallenge;

    @Column(name = "url_video")
    private String url;

}
