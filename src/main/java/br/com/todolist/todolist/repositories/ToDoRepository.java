package br.com.todolist.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.todolist.todolist.models.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    
}
