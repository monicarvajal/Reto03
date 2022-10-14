package com.example.reto3.Controller;

import com.example.reto3.Service.ClientService;
import com.example.reto3.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/id")
    public Optional<Client>  getClient(@PathVariable("id") int id) {
        return clientService.getClient(id);
}
    @PostMapping("/save")

    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Client client) {
        clientService.save (client);
    }
}
