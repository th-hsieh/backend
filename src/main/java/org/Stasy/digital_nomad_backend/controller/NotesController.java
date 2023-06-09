package org.Stasy.digital_nomad_backend.controller;

import org.Stasy.digital_nomad_backend.entity.Note;
import org.Stasy.digital_nomad_backend.repository.NotesRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class NotesController {

    @Autowired
    NotesRepository nRepo;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes(){
        return new ResponseEntity<List<Note>>(nRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/notes")
    public ResponseEntity<Note> createNote(@RequestBody Note note){
        return new ResponseEntity<Note>(nRepo.save(note),HttpStatus.CREATED);
    }

    @GetMapping("/notes/{id}")
    public ResponseEntity<Note> readNote(@PathVariable Long id){
        return new ResponseEntity<Note>(nRepo.findById(id).get(),HttpStatus.OK);
    }
    @DeleteMapping("/notes/{id}")
    public ResponseEntity<HttpStatus> deleteNote(@PathVariable Long id){
        nRepo.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/notes")
    public ResponseEntity<Note> updateNote(@RequestBody Note note){
        return new ResponseEntity<Note>(nRepo.save(note),HttpStatus.OK);
    }

}
