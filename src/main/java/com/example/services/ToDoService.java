package com.example.services;

import java.util.List;

import com.example.dto.TaskDTO;
import com.example.models.Task;

public interface ToDoService {
     TaskDTO readTask(Long id); 
     List<TaskDTO> readAllTasks(); 
}
