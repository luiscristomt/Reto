package com.example.reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="library")
public class Library implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibrary;
    private String name;
    private String target;
    private Integer capacity;
    private String description;
    @ManyToOne
    @JoinColumn(name="idCategory")
    @JsonIgnoreProperties("libs")
    private Category category;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "lib")
    @JsonIgnoreProperties({"clien","lib"})
    private List<Message> messages;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "lib")
    @JsonIgnoreProperties({"message","lib"})
    private List<Reservation> reservations;

    public Integer getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(Integer idLibrary) {
        this.idLibrary = idLibrary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
