package com.example.brewery.craftbeerexplorer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user", schema = "craftbeerexplorer") // Avoid using "user" as it's a reserved keyword in many DBMS
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String passwordHash; // Consider using a strong hashing function for storing passwords

    // Constructors, getters, and setters
}

