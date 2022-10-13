package com.example.reto3.services;

import com.example.reto3.entities.Category;
import com.example.reto3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
     @Autowired
     private CategoryRepository categoryRepository;
     public List<Category> getAll(){
         return categoryRepository.getAll();
     }
     public Category save(Category c){
         if(c.getIdCategory()==null){
             return categoryRepository.save(c);
         }
         else{
             Optional<Category> st= categoryRepository.getById(c.getIdCategory());
             if(!st.isPresent()){
                 return categoryRepository.save(c);
             }
             else{
                 return c;
             }
         }
     }
    public Optional<Category> getById(int id){
        return categoryRepository.getById(id);
    }
     public Category update(Category c){
         if(c.getIdCategory()!=null){
             Optional<Category> st= categoryRepository.getById(c.getIdCategory());
             if(st.isPresent()){
                 Category temp= st.get();
                 if(c.getName()!= null){
                     temp.setName(c.getName());
                 }
                 if(c.getDescription()!= null){
                     temp.setDescription(c.getDescription());
                 }
                 if(c.getLibs()!= null){
                     temp.setLibs(c.getLibs());
                 }
                 return categoryRepository.save(temp);
             }
         }
         return c;
     }
     /*public delete(Category c){
         if(c.getIdCategory()!= null){
             Optional<Category> st= categoryRepository.delete(c.getIdCategory());
             return categoryRepository.delete(c);
         }
         else {
             return c;
         }
     }*/
}

