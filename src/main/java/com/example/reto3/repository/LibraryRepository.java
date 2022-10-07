package com.example.reto3.repository;

import com.example.reto3.entidades.Library;
import com.example.reto3.repository.CRUDRepository.LibraryCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
