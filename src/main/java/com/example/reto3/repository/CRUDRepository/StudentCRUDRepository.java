package com.example.reto3.repository.CRUDRepository;

import com.example.reto3.entidades.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentCRUDRepository extends CrudRepository<Student, Integer> {
}
