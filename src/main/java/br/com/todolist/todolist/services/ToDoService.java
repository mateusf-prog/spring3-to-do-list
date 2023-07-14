package br.com.todolist.todolist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.todolist.todolist.model.ToDo;
import br.com.todolist.todolist.model.ToDoComponent;
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
            message.setMessage("Description cannot be empty!");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
        else {
            action.save(obj);
            message.setMessage("Successfully created!");
            return new ResponseEntity<>(message,HttpStatus.OK);
        }
    }

    public ResponseEntity<?> edit(ToDo obj){
        if (action.existsById(obj.getId()) == false) {
            message.setMessage("Not found ID");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
        else if (obj.getName().equals("")) {
            message.setMessage("Name cannot be empty!");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
        else if (obj.getDescription().equals("")) {
            message.setMessage("Description cannot be empty!");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
        else {
            action.save(obj);
            return new ResponseEntity<>(action.findById(obj.getId()), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> selectById(long id) {
        if (action.existsById(id) == false) {
            message.setMessage("Not Found!");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(action.findById(id), HttpStatus.OK);
        }        
    }

    public ResponseEntity<?> remove(long id){
        if (action.existsById(id) == false) {
            message.setMessage("Not Found!");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else {
            action.deleteById(id);
            message.setMessage("Successfully remove!");
            return new ResponseEntity<>(message, HttpStatus.OK);
        }
    }

    public ResponseEntity<List<ToDo>> selecAll() {
        return new ResponseEntity<>(action.findAll(), HttpStatus.OK);
    }
}
