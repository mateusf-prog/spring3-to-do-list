package br.com.todolist.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.todolist.todolist.models.ToDo;
import br.com.todolist.todolist.services.ToDoService;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService service;

    @GetMapping("/allToDos")
    public ResponseEntity<?> selectAll() {
        return service.selecAll();
    }

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody ToDo obj) {
        return service.create(obj);
    }

    @PostMapping("/updateToDo")
    public ResponseEntity<?> edit(@RequestBody ToDo obj) {
        return service.edit(obj);
    }
}
