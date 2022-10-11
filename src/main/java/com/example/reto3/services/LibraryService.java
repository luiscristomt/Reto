package com.example.reto3.services;

import com.example.reto3.entities.Library;
import com.example.reto3.repository.LibraryRepository;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;
    public List<Library> getAll(){
        return libraryRepository.getAll();
    }
    public Library save(Library l){
        if(l.getIdLibrary()== null){
            return libraryRepository.save(l);
        }
        else{
            Optional<Library> st= libraryRepository.getById(l.getIdLibrary());
            if(!st.isPresent()){
                return libraryRepository.save(l);
            }
            else{
                return l;
            }
        }
    }
    public Optional<Library> getById(int id){
        return libraryRepository.getById(id);
    }
    public Library update(Library l){
        if(l.getIdLibrary()!= null){
            Optional<Library> st= libraryRepository.getById(l.getIdLibrary());
            if(st.isPresent()){
                Library temp= st.get();
                if(l.getName()!= null){
                    temp.setName(l.getName());
                }
                if(l.getTarget()!= null){
                    temp.setTarget(l.getTarget());
                }
                if(l.getCapacity()!= null){
                    temp.setCapacity(l.getCapacity());
                }
                if(l.getDescription()!= null){
                    temp.setDescription(l.getDescription());
                }
                if(l.getCategory()!= null){
                    temp.setCategory(l.getCategory());
                }
                if(l.getMessages()!= null){
                    temp.setMessages(l.getMessages());
                }
                if(l.getReservations()!= null){
                    temp.setReservations(l.getReservations());
                }
                return libraryRepository.save(temp);
            }
        }
        return l;
    }
}
