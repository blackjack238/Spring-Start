package com.example.demo;


import java.util.*;
import com.example.demo.*;
import com.example.demo.CRUD.NoteService;
import com.example.demo.entity.Note;

public class Main {

public static void main(String[] args) {
        NoteService noteService = new NoteService();

        // Додавання нотатки
        Note note1 = new Note(2, "Content 1","info 2");
        noteService.add(note1);

        Note note2 = new Note(1, "Content 2","info 1");
        noteService.add(note2);

        // Отримання списку всіх нотаток
        List<Note> allNotes = noteService.listAll();
        System.out.println("All notes:");
        for (Note note : allNotes) {
        System.out.println(note);
        }

        // Отримання нотатки за ID
        long idToFind = note2.getId();
        Note foundNote = noteService.getById(idToFind);
        System.out.println("Note with ID " + idToFind + ": " + foundNote);

        // Оновлення нотатки
        foundNote.setTitle("Updated Title");
        foundNote.setContent("Updated Content");
        noteService.update(foundNote);

        // Видалення нотатки
        long idToDelete = note1.getId();
        noteService.deleteById(idToDelete);

        // Перевірка оновленого списку всіх нотаток
        allNotes = noteService.listAll();
        System.out.println("All notes after update and delete:");
        for (Note note : allNotes) {
        System.out.println(note);
        }
        }
        }