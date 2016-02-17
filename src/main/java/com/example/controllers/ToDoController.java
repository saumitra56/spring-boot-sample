package com.example.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.dto.TaskDTO;
import com.example.models.Task;
import com.example.repository.TaskRepository;
import com.example.services.ToDoService;
import com.example.utils.ReloadableProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static net.logstash.logback.marker.Markers.append;

import java.util.Date;
import java.util.List;

@RestController
public class ToDoController {
    
    private Logger logger = LoggerFactory.getLogger(ToDoController.class); 
    
    @Autowired
    private ToDoService toDoService; 
    
    @Autowired
    private ReloadableProperties reloadableProperties;
  
    @RequestMapping(value = "/task", method=RequestMethod.POST)
    @ResponseBody
    public void saveTask(@RequestBody TaskDTO task) {
    }
    
    @RequestMapping(value="/task", method=RequestMethod.GET) 
    @ResponseBody
    public void getTask() {
    }
    
    /*
     * Input - 
     * Output - 
     * Description - 
     */
    @RequestMapping(value = "/tasks", method=RequestMethod.GET)
    @ResponseBody
    public List<TaskDTO> readTasks() {
        //TODO: add a null check 
        logger.info(append("clientid", "sadasd").and(append("requiestd", "")), "Entering method");
        
        //Info - describe a particular block of code 
        return toDoService.readAllTasks();      //describe a particular statement 
    }
    
    
    

}