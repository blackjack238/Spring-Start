package com.example.demo.entity;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Note {
    long id;
    String title;
    String content;

    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
