package com.example.reto3.services;

import com.example.reto3.entidades.University;
import com.example.reto3.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    public UniversityRepository universityRepository;
    public List<University> getAll(){
        return universityRepository.getAll();
    }
    public University save(University u){
        return universityRepository.save(u);
    }
}
