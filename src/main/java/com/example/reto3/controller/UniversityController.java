package com.example.reto3.controller;

import com.example.reto3.entidades.University;
import com.example.reto3.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/University")
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @GetMapping("/all")
    public List<University> getAll(){
        return universityService.getAll();
    }
    @PostMapping("/save")
    public University save(@RequestBody University u){
        return universityService.save(u);
    }
}
