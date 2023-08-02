package com.example.demo;

import com.example.demo.CRUD.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

        private final NoteService noteService;

        @Autowired
        public TestController(NoteService noteService) {
                this.noteService = noteService;
        }

        @GetMapping("/test")
        public String test() {
                // Використовуємо noteService для доступу до функціональності сервісу
                return "Hello from TestController!";
        }
}