package com.example.reto3.controller;

import com.example.reto3.entities.Library;
import com.example.reto3.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Library")
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
    @PutMapping("/update")
    public Library update(@RequestBody Library l){
        return libraryService.update(l);
    }
}