package com.example.reto3.Repository.Crud;

import com.example.reto3.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CrudRepositoryReservation extends CrudRepository<Reservation,Integer> {
    @Query
    public List<Reservation> findAllByStatus(String status);

    @Query
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date fechaInicio, Date fechaFin);

    @Query ("SELECT c.client, COUNT(c.client) from Reservation  AS c  group by c.client order by COUNT(c.client)DESC ")
    List<Object[]> reporteClientes();
}
