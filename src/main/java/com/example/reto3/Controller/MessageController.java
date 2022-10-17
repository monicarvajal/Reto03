package com.example.reto3.Controller;

import com.example.reto3.Service.MessageService;
import com.example.reto3.model.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Messages> getAll(){
        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Messages> getMessages(@PathVariable("id") int id){
        return messageService.getMessages(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save (@RequestBody Messages messages) {
        messageService.save(messages);
    }



}
