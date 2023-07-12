package br.com.todolist.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.todolist.todolist.models.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    
    ToDo selectById(int id);

    ToDo selectByPriority(String priority);
}
