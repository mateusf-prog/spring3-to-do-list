package br.com.todolist.todolist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.todolist.todolist.repositories.ToDoRepository;

@Service
public class ToDoService {
    
    @Autowired
    private ToDoRepository action;

    public ResponseEntity<?> create(){

    }

    public ResponseEntity<?> edit(){
        
    }

    public ResponseEntity<?>select(){
        
    }

    public ResponseEntity<?> remove(){
        
    }
}
