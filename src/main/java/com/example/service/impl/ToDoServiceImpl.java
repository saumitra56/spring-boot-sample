package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.TaskDTO;
import com.example.models.Task;
import com.example.repository.TaskRepository;
import com.example.services.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService{
  
  @Autowired
  private TaskRepository taskRepository;

  public TaskDTO readTask(Long id) {
    //add logs before and after db call 
    Task t = taskRepository.findById(id); 
    return new TaskDTO (t); 
  }

  public List<TaskDTO> readAllTasks() {
    return TaskDTO.convert(taskRepository.getAllTasks()); 
  }  
  
  
}
