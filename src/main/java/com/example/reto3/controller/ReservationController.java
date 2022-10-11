package com.example.reto3.controller;

import com.example.reto3.entities.Category;
import com.example.reto3.entities.Reservation;
import com.example.reto3.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation r){
        return reservationService.save(r);
    }
    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int reservationid){
        return reservationService.getById(reservationid);
    }
    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation r){
        return reservationService.update(r);
    }
}
