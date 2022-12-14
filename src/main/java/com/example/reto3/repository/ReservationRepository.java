package com.example.reto3.repository;

import com.example.reto3.entities.Reservation;
import com.example.reto3.repository.CRUDRepository.ReservationCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCRUDRepository reservationCRUDRepository;
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCRUDRepository.findAll();
    }
    public Reservation save(Reservation r){
        return reservationCRUDRepository.save(r);
    }
    public Optional<Reservation> getById(int id){
        return reservationCRUDRepository.findById(id);
    }
    public Reservation update(Reservation r){return reservationCRUDRepository.save(r);}
    /*public Reservation delete(Reservation r){return reservationCRUDRepository.delete(r);}
    public Optional<Reservation> deleteById(int id){return reservationCRUDRepository.deleteById(id);}*/
}
