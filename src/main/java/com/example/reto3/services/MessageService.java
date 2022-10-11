package com.example.reto3.services;

import com.example.reto3.entities.Message;
import com.example.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    public List<Message> getAll(){
        return messageRepository.getAll();
    }
    public Message save(Message m){
        if(m.getIdMessage()== null){
            return messageRepository.save(m);
        }
        else{
            Optional<Message> st= messageRepository.getById(m.getIdMessage());
            if(!st.isPresent()){
                return messageRepository.save(m);
            }
            else{
                return m;
            }
        }
    }
    public Optional<Message> getById(int id){
        return messageRepository.getById(id);
    }
    public Message update(Message m){
        if(m.getIdMessage()!= null){
            Optional<Message> st= messageRepository.getById(m.getIdMessage());
            if(st.isPresent()){
                Message temp= st.get();
                if(m.getMessageText()!= null){
                    temp.setMessageText(m.getMessageText());
                }
                if(m.getLib()!= null){
                    temp.setLib(m.getLib());
                }
                if(m.getClient()!= null){
                    temp.setClient(m.getClient());
                }
                return messageRepository.save(temp);
            }
        }
        return m;
    }
}
