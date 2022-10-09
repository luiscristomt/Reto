package com.example.reto3.repository;

import com.example.reto3.entities.Library;
import com.example.reto3.repository.CRUDRepository.LibraryCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {
    @Autowired
    private LibraryCRUDRepository libraryCRUDRepository;

    public List<Library> getAll(){
        return (List<Library>) libraryCRUDRepository.findAll();
    }
    public Library save(Library l){
        return libraryCRUDRepository.save(l);
    }
    public Optional<Library> getById(int id){
        return libraryCRUDRepository.findById(id);
    }
}
