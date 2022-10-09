package com.example.reto3.repository.CRUDRepository;

import com.example.reto3.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCRUDRepository extends CrudRepository<Reservation,Integer> {
}
