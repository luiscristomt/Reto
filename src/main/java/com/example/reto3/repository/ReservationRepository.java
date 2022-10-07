package com.example.reto3.repository;

import com.example.reto3.entidades.Reservation;
import com.example.reto3.repository.CRUDRepository.ReservationCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
