package com.example.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.models.Task;

public class TaskDTO {
  private String name; 
  private String description; 
  private Date dueDate; 
  private Date createdDate;
  
 

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public static List<TaskDTO> convert(List<Task> tasks) {
    List<TaskDTO> taskList = new ArrayList<TaskDTO>(); 
    for (Task t:tasks) {
      taskList.add(new TaskDTO(t)); 
    }
    return taskList; 
  }
  
  public TaskDTO(Task task) {
    this.name = task.getName(); 
    this.description = task.getDescription(); 
    this.dueDate = task.getDueDate();
    this.createdDate = task.getCreatedTimestamp(); 
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
}
