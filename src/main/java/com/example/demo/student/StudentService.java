/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gdicaterina
 */
@Service
public class StudentService {
        public List<Student> getStudents() {
        return List.of(
                new Student(1L, 
                        "gdicaterina", 
                        "gaboo.dcc2@gmail.com", 
                        LocalDate.now(), 
                        21)
        );
    }
}
