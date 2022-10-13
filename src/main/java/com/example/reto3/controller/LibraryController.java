package com.example.reto3.controller;

import com.example.reto3.entities.Category;
import com.example.reto3.entities.Library;
import com.example.reto3.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Lib")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Library save(@RequestBody Library l){
        return libraryService.save(l);
    }
    @GetMapping("/{id}")
    public Optional<Library> getLibrary(@PathVariable("id") int libraryid){
        return libraryService.getById(libraryid);
    }
    @PutMapping("/update")
    public Library update(@RequestBody Library l){
        return libraryService.update(l);
    }
}
