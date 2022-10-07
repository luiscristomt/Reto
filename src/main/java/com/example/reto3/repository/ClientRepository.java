package com.example.reto3.repository;

import com.example.reto3.entidades.Client;
import com.example.reto3.repository.CRUDRepository.ClientCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCRUDRepository clientCRUDRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCRUDRepository.findAll();
    }
    public Client save(Client c){
        return clientCRUDRepository.save(c);
    }
}