package com.example.demo.CRUD;


import com.example.demo.entity.Note;

import java.util.*;

public class NoteService {

    private final Map<Long, Note> notesMap = new HashMap<>();
    private final Random random = new Random();

    public List<Note> listAll() {
        return new ArrayList<>(notesMap.values());
    }

    public Note add(Note note) {
        long id = generateUniqueId();
        note.setId(id);
        notesMap.put(id, note);
        return note;
    }

    public void deleteById(long id) {
        if (!notesMap.containsKey(id)) {
            throw new NoSuchElementException("Note with ID " + id + " not found.");
        }
        notesMap.remove(id);
    }

    public void update(Note note) {
        long id = note.getId();
        if (!notesMap.containsKey(id)) {
            throw new NoSuchElementException("Note with ID " + id + " not found.");
        }
        notesMap.put(id, note);
    }

    public Note getById(long id) {
        Note note = notesMap.get(id);
        if (note == null) {
            throw new NoSuchElementException("Note with ID " + id + " not found.");
        }
        return note;
    }

    private long generateUniqueId() {
        long id;
        do {
            id = random.nextLong();
        } while (id <= 0 || notesMap.containsKey(id));
        return id;
    }}