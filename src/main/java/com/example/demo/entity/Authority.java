package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String authority;

    // getters and setters
}