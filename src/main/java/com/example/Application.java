package com.example; 

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan
@ComponentScan
@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication

public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
