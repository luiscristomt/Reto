package com.example.reto3.repository;

import com.example.reto3.entities.Student;
import com.example.reto3.repository.CRUDRepository.StudentCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {
    @Autowired
    private StudentCRUDRepository studentCRUDRepository;

    public List<Student> getAll(){
        return (List<Student>) studentCRUDRepository.findAll();
    }

    public Student save(Student s){
        return studentCRUDRepository.save(s);
    }
    public Optional<Student> getById(int id){
        return studentCRUDRepository.findById(id);
    }
}
