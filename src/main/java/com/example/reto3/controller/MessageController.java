package com.example.reto3.controller;

import com.example.reto3.entities.Category;
import com.example.reto3.entities.Message;
import com.example.reto3.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @GetMapping("/all")
    public List<Message> getAll(){
        return messageService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message m){
        return messageService.save(m);
    }
    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") int messageid){
        return messageService.getById(messageid);
    }
    @PutMapping("/update")
    public Message update(@RequestBody Message m){
        return messageService.update(m);
    }
}
