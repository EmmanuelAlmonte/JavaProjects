package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {


  private StudentRepository repository;

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    this.repository = repository;
    return args -> {
      Student mariam = new Student(
          "Mary",
          "mary@gmail.com",
          LocalDate.of(2000, Month.APRIL, 1));
      Student mike = new Student(
          "Mike",
          "Mike@gmail.com",
          LocalDate.of(2005, Month.APRIL, 1));

      repository.saveAll(List.of(mariam, mike));
    };

  }
}
/*
 * new Student(1L,
 * "Mary",
 * "mary@gmail.com",
 * LocalDate.of(2000, Month.JANUARY, 1), 21));
 */