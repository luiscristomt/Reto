package com.example.reto3.controller;

import com.example.reto3.entities.Category;
import com.example.reto3.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category c){
        return categoryService.save(c);
    }
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int clientid){
        return categoryService.getById(clientid);
    }
    @PutMapping("/update")
    public Category update(@RequestBody Category c){
        return categoryService.update(c);
    }
}
