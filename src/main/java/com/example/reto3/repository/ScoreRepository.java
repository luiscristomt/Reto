package com.example.reto3.repository;

import com.example.reto3.entidades.Score;
import com.example.reto3.repository.CRUDRepository.ScoreCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCRUDRepository scoreCRUDRepository;
    public List<Score> getAll(){
        return (List<Score>) scoreCRUDRepository.findAll();
    }
    public Score save(Score s){
        return scoreCRUDRepository.save(s);
    }
}