package com.example.reto3.services;

import com.example.reto3.entities.Client;
import com.example.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    public Client save(Client c){
        if(c.getIdClient()== null){
            return clientRepository.save(c);
        }
        else{
            Optional<Client> st= clientRepository.getById(c.getIdClient());
            if(!st.isPresent()){
                return clientRepository.save(c);
            }
            else{
                return c;
            }
        }
    }
    public Optional<Client> getById(int id){
        return clientRepository.getById(id);
    }
    public Client update(Client c){
        if(c.getIdClient()!= null){
            Optional<Client> st= clientRepository.getById(c.getIdClient());
            if(st.isPresent()){
                Client temp= st.get();
                if(c.getEmail()!= null){
                    temp.setEmail(c.getEmail());
                }
                if(c.getPassword()!= null){
                    temp.setPassword(c.getPassword());
                }
                if(c.getName()!= null){
                    temp.setName(c.getName());
                }
                if(c.getAge()!= null){
                    temp.setAge(c.getAge());
                }
                if(c.getMessages()!= null){
                    temp.setMessages(c.getMessages());
                }
                if(c.getReservations()!= null){
                    temp.setReservations(c.getReservations());
                }
                return clientRepository.save(temp);
            }
        }
        return c;
    }
}
