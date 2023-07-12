package br.com.todolist.todolist.models;

import org.springframework.stereotype.Component;

@Component
public class ToDoComponent {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
