package com.innovasoft.PO2Academy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "challenge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
   /* @OneToMany(mappedBy = "challenge", fetch = FetchType.LAZY)*/
   // private List<Question> questionList;
}
