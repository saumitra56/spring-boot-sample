package com.example.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{    
     
      @Query(value = "select * from task", nativeQuery=true)
      public List<Task> getAllTasks();

      public Task findById(Long id); 
        
     
      
}
