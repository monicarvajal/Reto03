package com.example.reto3.Repository.Crud;

import com.example.reto3.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CrudRepositoryReservation extends CrudRepository<Reservation,Integer> {
    public List<Reservation> findAllByStatus(String status);

    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date fechaInicial, Date fechaFinal);

    @Query
    public List<Object[]> reporteClientes();
}
