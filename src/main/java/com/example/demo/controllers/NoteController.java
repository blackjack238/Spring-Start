package com.example.demo.controllers;

import com.example.demo.entity.Note;
import com.example.demo.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/note")//2
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/list")
    public String listNotes(Model model) {
        model.addAttribute("notes", noteService.listAll());
        return "list_notes";
    }

    @GetMapping("/edit")
    public String editNote(@RequestParam long id, Model model) {
        Note note = noteService.getById(id);
        model.addAttribute("note", note);
        return "edit_note";
    }

    @PostMapping("/edit")
    public String saveEditedNote(@ModelAttribute Note note) {
        noteService.update(note);
        return "redirect:/note/list";
    }

    @PostMapping("/delete")
    public String deleteNote(@RequestParam long id) {
        noteService.deleteById(id);
        return "redirect:/note/list";
    }
}