package com.example.reto3.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;
    private Library lib;
    private Client client;
}
