package com.example.reto3.controller;

import com.example.reto3.entities.Message;
import com.example.reto3.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Message save(@RequestBody Message m){
        return messageService.save(m);
    }
    @PutMapping("/update")
    public Message update(@RequestBody Message m){
        return messageService.update(m);
    }
}
