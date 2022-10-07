package com.example.reto3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/MiController")
public class MiController {
    @GetMapping("/{id}")
    public String saludar(@PathVariable("id")int grupo){
        if(grupo>5){
            return "<h1>No hay a quien saludar</h1> Busca a quien saludar";
        }
        else {
            return "<h1>Hola " + grupo + "</h1>";
        }
    }
}
