package com.example.reto3.repository;

import com.example.reto3.entities.Score;
import com.example.reto3.repository.CRUDRepository.ScoreCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    public Optional<Score> getById(int id){
        return scoreCRUDRepository.findById(id);
    }
    public Score update(Score s){return scoreCRUDRepository.save(s);}
    /*public Score delete(Score s){return scoreCRUDRepository.delete(s);}
    public Optional<Score> deleteById(int id){return scoreCRUDRepository.deleteById(id);}*/
}
