package com.example.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column(name = "created_timestamp", nullable = true)
  private Date createdTimestamp;

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  @Column(name = "name", length = 50)
  private String name;

  @Column(name = "desciption", length = 50, nullable = true)
  private String description;

  @Column(name = "due_date", nullable = true)
  private Date dueDate;

  @PrePersist
  public void onCreate() {
    createdTimestamp = new Date();
  }
  
  public Task() {
  }

  public Task(Date createdTimestamp, String name, String description, Date dueDate) {
    super();
    this.createdTimestamp = createdTimestamp;
    this.name = name;
    this.description = description;
    this.dueDate = dueDate; 
  }

  public Date getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Date createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
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



}
