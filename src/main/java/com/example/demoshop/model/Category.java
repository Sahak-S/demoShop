package com.example.demoshop.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private int id;
    private String name;
}
