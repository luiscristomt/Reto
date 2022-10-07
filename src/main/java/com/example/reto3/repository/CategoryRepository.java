package com.example.reto3.repository;

import com.example.reto3.entidades.Category;
import com.example.reto3.repository.CRUDRepository.CategoryCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCRUDRepository categoryCRUDRepository;
    public List<Category> getAll() {
        return (List<Category>) categoryCRUDRepository.findAll();
    }
    public Category save(Category c){
        return categoryCRUDRepository.save(c);
    }
}
