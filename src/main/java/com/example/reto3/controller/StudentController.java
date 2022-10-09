package com.example.reto3.controller;

import com.example.reto3.entities.Student;
import com.example.reto3.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.getAll();
    }
    @PostMapping("/save")
    public Student save(@RequestBody Student s){
        return studentService.save(s);
    }
    @PostMapping("/update")
    public Student update(@RequestBody Student s){
        return studentService.update(s);
    }
}
