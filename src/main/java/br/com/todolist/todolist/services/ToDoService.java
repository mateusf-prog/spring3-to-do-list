package br.com.todolist.todolist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.todolist.todolist.models.ToDo;
import br.com.todolist.todolist.models.ToDoComponent;
import br.com.todolist.todolist.repositories.ToDoRepository;

@Service
public class ToDoService {
    
    @Autowired
    private ToDoRepository action;

    @Autowired
    private ToDoComponent message;

    public ResponseEntity<?> create(ToDo obj){
        if (obj.getName().equals("")) {
            message.setMessage("Name cannot be empty!");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
        else if (obj.getDescription().equals("")) {
            message.setMessage("Desprition cannot be empty!");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
        else {
            action.save(obj);
            message.setMessage("Successfully created!");
            return new ResponseEntity<>(message,HttpStatus.OK);
        }
    }

    public ResponseEntity<?> edit(ToDo obj){
        
    }

    public ResponseEntity<?>select(int id) {
        
    }

    public ResponseEntity<?> remove(int id){
        
    }
}
