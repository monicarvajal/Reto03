package com.example.reto3.Repository;

import com.example.reto3.Repository.Crud.CrudRepositoryReservation;
import com.example.reto3.model.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private CrudRepositoryReservation crudRepositoryReservation;


    public List<Reservation> getAll(){
        return (List<Reservation>) crudRepositoryReservation.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return crudRepositoryReservation.findById(id);
    }

    public Reservation save(Reservation reservation){
        return crudRepositoryReservation.save(reservation);
    }
}
