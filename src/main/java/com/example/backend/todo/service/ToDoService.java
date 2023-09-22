package com.example.backend.todo.service;

import com.example.backend.todo.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public List<ToDo> getToDoList()
    {
        return toDoRepository.findAll();
    }
}
