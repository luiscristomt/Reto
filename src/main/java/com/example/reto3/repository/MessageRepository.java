package com.example.reto3.repository;

import com.example.reto3.entidades.Message;
import com.example.reto3.repository.CRUDRepository.MessageCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCRUDRepository messageCRUDRepository;
    public List<Message> getAll(){
        return (List<Message>) messageCRUDRepository.findAll();
    }
    public Message save(Message m){
        return messageCRUDRepository.save(m);
    }
}
