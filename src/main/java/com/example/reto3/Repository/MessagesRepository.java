package com.example.reto3.Repository;

import com.example.reto3.model.Messages;
import com.example.reto3.Repository.Crud.CrudRepositoryMessages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessagesRepository {
    @Autowired
    private CrudRepositoryMessages crudRepositoryMessages;


    public List<Messages> getAll(){
        return (List<Messages>) crudRepositoryMessages.findAll();
    }
    public Optional<Messages> getMessages(int id){
        return crudRepositoryMessages.findById(id);
    }

    public Messages save(Messages messages){
        return crudRepositoryMessages.save(messages);
    }

}
