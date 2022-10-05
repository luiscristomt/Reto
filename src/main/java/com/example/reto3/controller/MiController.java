package com.example.reto3.controller;

import com.example.reto3.dto.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MiController {
    @GetMapping("/{id}")
    public String saludar(@PathVariable("id")int grupo){
        if(grupo>5){
            return "No hay a quien saludar";
        }
        else {
            return "<h1>Hola " + grupo + "</h1>";
        }
    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getName());
        return student;
    }
}
