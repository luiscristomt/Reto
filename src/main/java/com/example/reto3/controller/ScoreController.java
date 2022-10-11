package com.example.reto3.controller;

import com.example.reto3.entities.Category;
import com.example.reto3.entities.Score;
import com.example.reto3.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @GetMapping("/all")
    public List<Score> getAll(){
        return scoreService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score s){
        return scoreService.save(s);
    }
    @GetMapping("/{id}")
    public Optional<Score> getScore(@PathVariable("id") int scoreid){
        return scoreService.getById(scoreid);
    }
    @PutMapping("/update")
    public Score update(@RequestBody Score s){
        return scoreService.update(s);
    }
}
