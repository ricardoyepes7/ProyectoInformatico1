package com.innovasoft.PO2Academy.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "level")
    private Integer level;
}
