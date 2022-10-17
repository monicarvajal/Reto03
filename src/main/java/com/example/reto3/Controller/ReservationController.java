package com.example.reto3.Controller;

import com.example.reto3.Service.ReservationService;
import com.example.reto3.model.Reservation;
import com.example.reto3.reportes.ContadorClientes;
import com.example.reto3.reportes.StatusReservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int id) {
        return reservationService.getReservation(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Reservation reservation) {
         reservationService.save(reservation);
    }

    @GetMapping("/report-status")
    public StatusReservas getStatusReservas() {
        return reservationService.ReservacionStatus();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservasTiempo(@PathVariable("dateOne") String fechaInicial,@PathVariable("dateTwo") String fechaFinal) {
        return reservationService.ReservacionTiempo(fechaInicial, fechaFinal);
    }

    @GetMapping("/report-clients")
    public List<ContadorClientes> getClientes() {
        return reservationService.reporteClientes();
    }
}
