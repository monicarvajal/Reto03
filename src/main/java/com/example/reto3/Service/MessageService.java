package com.example.reto3.Service;

import com.example.reto3.Repository.MessagesRepository;
import com.example.reto3.model.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessagesRepository messagesRepository;

    public List<Messages> getAll(){
        return messagesRepository.getAll();
    }
    public Optional<Messages> getMessages(int id) {
        return messagesRepository.getMessages(id);
    }
    public Messages save (Messages messages) {
        if(messages.getIdMessage() == null){
            return messagesRepository.save(messages);
        }else {
            Optional<Messages> messages1 = messagesRepository.getMessages(messages.getIdMessage());
            if (messages1.isEmpty()) {
                return  messagesRepository.save(messages);
            }else {
                return messages;
            }
        }
    }


}
