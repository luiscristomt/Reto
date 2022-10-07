package com.example.reto3.repository;

import com.example.reto3.entidades.University;
import com.example.reto3.repository.CRUDRepository.UniversityCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UniversityRepository {
    @Autowired
    private UniversityCRUDRepository universityCRUDRepository;

    public List<University> getAll(){
        return (List<University>) universityCRUDRepository.findAll();
    }
    public University save(University u){
        return universityCRUDRepository.save(u);
    }
}
