package com.example.reto3.repository;

import com.example.reto3.entities.Message;
import com.example.reto3.repository.CRUDRepository.MessageCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    public Optional<Message> getById(int id){
        return messageCRUDRepository.findById(id);
    }
    public Message update(Message m){return messageCRUDRepository.save(m);}
    /*public Message delete(Message m){return messageCRUDRepository.delete(m);}
    public Optional<Message> deleteById(int id){return messageCRUDRepository.deleteById(id);}*/
}
