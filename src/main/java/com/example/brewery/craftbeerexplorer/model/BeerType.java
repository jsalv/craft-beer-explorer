package com.example.brewery.craftbeerexplorer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "beer_type", schema = "craftbeerexplorer")
public class BeerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;

    public enum Type {
        IPA, STOUT, LAGER, PALE_ALE, PILSNER, PORTER
    }

    // Constructors, getters, and setters
}

