package com.example.final_project.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "item_model")
public class AdvertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    String name;

    @Column(name = "weight")
    double price;

    @Column(name = "disc")
    private String disc;

    @Column(name = "url")
    private String url;
}
