package com.example.brewery.craftbeerexplorer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "brewery", schema = "craftbeerexplorer")
public class Brewery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "location")
    private String location;

    private Integer founded;

    // Constructors, getters, and setters
}

