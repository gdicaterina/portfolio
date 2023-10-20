/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author gdicaterina
 */
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return (args) -> {
            Student me = new Student(                    
                    "gdicaterina",
                    "gaboo.dcc2@gmail.com",
                    LocalDate.of(1993, Month.OCTOBER, 26));
            
            Student pedro = new Student(                    
                    "pedoAlvarez",
                    "pedoAlvarez@gmail.com",
                    LocalDate.of(1994, Month.JANUARY, 25));
            
            studentRepository.saveAll(            
                   List.of(me, pedro)
            );
        };
    }
}
