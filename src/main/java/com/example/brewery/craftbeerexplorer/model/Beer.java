package com.example.brewery.craftbeerexplorer.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "beer", schema = "craftbeerexplorer")
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double abv;
    private String description;
    private int breweryId;
}
